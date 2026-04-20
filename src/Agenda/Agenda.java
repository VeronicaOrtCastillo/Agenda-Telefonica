package Agenda;

public class Agenda {
    //Aaron














     //Jesus
    //Añadir contacto y contacto existente 

    public void añadirContacto(Contacto c){
        System.out.println("AÑADE UN CONTACTO");
        boolean existe = false;

        // Revisar si el contacto ya existe
        for (int i = 0; i < cantidad; i++) {
            if (agenda[i].getNombre().equals(c.getNombre()) &&
                    agenda[i].getApellidos().equals(c.getApellidos())) {

                existe = true;
                break;
            }
        }

        // Si ya existe, no se agrega
        if (existe) {
            System.out.println("El contacto ya existe");
        }
        // Si no existe, revisar espacio
        else if (cantidad < 10) {
            agenda[cantidad] = c;
            cantidad++;
            System.out.println("Contacto agregado correctamente");
        }
        // Si no hay espacio
        else {
            System.out.println("La agenda está llena");
        }
    }

    }








    //Vero









    //Oswaldo










    //Aaron










}
