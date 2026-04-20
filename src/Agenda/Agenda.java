package Agenda;

public class Agenda {
    //Aaron

    private int capacidad = 10; // Aquí guardamos el límite máximo
    //Jesus


    //Vero


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