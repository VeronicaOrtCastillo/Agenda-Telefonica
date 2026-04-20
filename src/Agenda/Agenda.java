package Agenda;

public class Agenda {
    //Aaron


    //Jesus


    //Vero


    //Oswaldo

    public void eliminarContacto(Contacto c) {
        if (c == null) {
            System.out.println("No se puede eliminar un contacto nulo...");

        }

        boolean estado = false;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].equals[c]) {
                estado = true;
                contactos[i] = null;
                System.out.println("Contacto eliminado correctamente...");
                break;
            }
        }

        if(!estado){
            System.out.println("No se encontro el contacto");
        }
    }

    //Verificar si la agenda esta llena
    public Boolean agendaLlena() {
        //Se verifica cada índice del arreglo, en caso que algun índice sea NULL entonces aún tiene espacio
        for (int i = 0; i < contacto.length; i++) {
            if (contacto[i] == null) {
                return false;
            }
        }
        //Sino todo es diferente de NULL entonces esta llena
        return true;
    }
    //Aaron










}
