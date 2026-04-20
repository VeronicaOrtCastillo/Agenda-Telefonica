package Agenda;

public class Agenda {
    //Aaron

    private int capacidad = 10; // Aquí guardamos el límite máximo
    //Jesus









    //Vero
    // Metodo listarContactos: Mostrar todos los contactos de la agenda
    public void listarContactos(){
        System.out.println("\n CONTACTOS");
        if (contactos.isEmpty()) { //Verificamos si la lista esta vacía
            System.out.println("Agenda Vacía");
            return;
        }
        for (Contacto c : contactos) { //Recorremos la lista de contactos
            System.out.println(c);
        }
    }
    //Metodo buscarContacto: Busca un contacto por su nombre y muestra su telefono
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










}
