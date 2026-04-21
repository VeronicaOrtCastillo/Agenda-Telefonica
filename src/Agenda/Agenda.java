package Agenda;

import java.util.Collections;
import java.util.Comparator;

public class Agenda {
    //Aaron
    private List <Contacto> listaContacto;
    private int capacidad = 10; // Aquí guardamos el límite máximo

    public Agenda() {
        this.listaContacto = new arrayList <> ();
    }













     //Jesus
    //Añadir contacto y contacto existente 

    public void añadirContacto(Contacto c){
        System.out.println("AÑADE UN CONTACTO");
        boolean existe = false;

        // Revisar si el contacto ya existe
        for (Contacto existente : contactos) {
            if(existente.getNombre().equalsIgnoreCase(c.getNombre()) &&
                    existente.getApellidos().equalsIgnoreCase(c.getApellidos()))
            {

                existe = true;
                break;
            }
        }

        // Si ya existe, no se agrega
        if (existe) {
            System.out.println("El contacto ya existe");
        }
        // Si no existe, revisar espacio
        else if (contactos.size() < capacidad) {
            contactos.add(c);
            System.out.println("Contacto agregado correctamente");
        }
        // Si no hay espacio
        else {
            System.out.println("La agenda está llena");
        }
    }

    }



    //Vero
    // METODO listarContactos: Mostrar todos los contactos de la agenda
    public void listarContactos(){
        System.out.println("\n CONTACTOS");
        if (contactos.isEmpty()) { //Verificamos si la lista esta vacía
            System.out.println("Agenda Vacía");
            return;
        }
        //Se ordena la lista antes de mostrarla
        Collections.sort(contactos, new Comparator<Contacto>(){
            @Override
            public int compare(Contacto c1, Contacto c2) {
                int resultadoNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre()); // Comparamos nombres ignorando mayúsculas

                if (resultadoNombre == 0) { // Si los nombres son iguales, comparamos apellidos
                    return c1.getApellidos().compareToIgnoreCase(c2.getApellidos());
                }
                return resultadoNombre; // Si no son iguales, usamos el resultado del nombre
            }
        });
        for (Contacto c : contactos) { //Recorremos la lista de contactos ya ordenada
            System.out.println(c.getNombre() + " " + c.getApellidos() + " " + c.getTelefono()
            );
        }
    }
    //METODO buscarContacto: Busca un contacto por su nombre y muestra su telefono
    public void buscarContacto(String nombre, String apellidos) {
        for (Contacto c : contactos) { //Recorremos todos los contactos
            boolean mismoNombre = c.getNombre().equalsIgnoreCase(nombre); //Comparamos el nombre,se ignoran mayusculas y minusculas
            boolean mismosApellidos = c.getApellidos().equalsIgnoreCase(apellidos); //Comparamos el apellido,se ignoran mayusculas y minusculas
            if (mismoNombre && mismosApellidos){ //Si son iguales tanto nombre como apellido
                System.out.println(nombre + " " + apellidos + " Telefono: " + c.getTelefono());
                return;
            }
        }
        System.out.println("Contacto no encontrado");
    }

    //Oswaldo

    // Se verifica si se puede eliminar el contacto
    public void eliminarContacto(Contacto c) {
        if (contactos.remove(c)) {
            System.out.println("Contacto eliminado correctamente.");
        } else {
            System.out.println("No se encontró el contacto para eliminar.");
        }
    }

    // La agenda está llena si el número de elementos llegó al límite
    public Boolean agendaLlena() {
        return contactos.size() >= capacidad;
    }
    //Aaron
    // Metodo espaciosLibres

public void mostrarEspaciosLibres() {

    int libres = capacidad - contactos.size();
    System.out.println("Espacios libres: " + libres + " de " + capacidad);
}











}
