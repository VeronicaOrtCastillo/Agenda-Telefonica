package org.gen.agendademo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Agenda {
    //Aaron
    private final List<Contacto> contactos;
    private final int capacidad = 10; // Aquí guardamos el límite máximo

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    //Jesus
    //Añadir contacto
    public void anadirContacto(Contacto c){
        System.out.println("AÑADE UN CONTACTO");

        // Verificamos internamente si existe
        boolean existe = false;
        for (Contacto existente : contactos) {
            if(existente.equals(c)) {
                existe = true;
                break;
            }
        }

        if (existe) {
            System.out.println("El contacto ya existe");
        } else if (contactos.size() < capacidad) {
            contactos.add(c);
            System.out.println("Contacto agregado correctamente");
        } else {
            System.out.println("La agenda está llena");
        }
    }

    // Verificar si existe el contacto retorna void
    public void existeContacto(Contacto c) {
        boolean existe = false;
        for (Contacto existente : contactos) {
            if(existente.equals(c)) {
                existe = true;
                break;
            }
        }

        if (existe) {
            System.out.println("El contacto sí existe.");
        } else {
            System.out.println("El contacto no existe.");
        }
    }

    //Vero
    // METODO listarContactos: Mostrar todos los contactos de la agenda
    public void listarContactos(){
        System.out.println("\n--- CONTACTOS ---");
        if (contactos.isEmpty()) { //Verificamos si la lista esta vacía
            System.out.println("Agenda Vacía");
            return;
        }
        //Se ordena la lista antes de mostrarla
        contactos.sort(new Comparator<Contacto>() {
            @Override
            public int compare(Contacto c1, Contacto c2) {
                int resultadoNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());

                if (resultadoNombre == 0) {
                    return c1.getApellidos().compareToIgnoreCase(c2.getApellidos());
                }
                return resultadoNombre;
            }
        });
        for (Contacto c : contactos) {
            System.out.println("Nombre: " + c.getNombre() + " " + c.getApellidos() + " | Telefono: " + c.getTelefono());
        }
    }

    //METODO buscaContacto: Busca un contacto por su nombre y muestra su telefono (retorna void)
    public void buscaContacto(String nombre) {
        boolean encontrado = false;
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Encontrado -> " + c.getNombre() + " " + c.getApellidos() + " - Telefono: " + c.getTelefono());
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("Contacto no encontrado");
        }
    }

    //Oswaldo
    // Se verifica si se puede eliminar el contacto
    public void eliminarContacto(Contacto c) {
        // ArrayList.remove() usará el metodo equals() de Contacto
        if (contactos.remove(c)) {
            System.out.println("Contacto eliminado correctamente.");
        } else {
            System.out.println("No se encontró el contacto para eliminar.");
        }
    }

    // La agenda está llena si el número de elementos llegó al límite devolviendo boolean
    public boolean agendaLlena() {
        return contactos.size() >= capacidad;
    }

    //Aaron
    // Metodo espaciosLibres retornando int
    public int espacioLibres() {
        return capacidad - contactos.size();
    }
}
