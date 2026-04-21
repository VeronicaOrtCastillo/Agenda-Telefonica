package Agenda;

public class Agenda {
    //Aaron
    private List <Contacto> listaContacto;

    public Agenda() {
        this.listaContacto = new arrayList <> ();
    }

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
    // Metodo espaciosLibres

    // Contamos los espacios libres
    public int espaciosLibres() {
        int contador = 0;
        for (int i = 0; i < contacto.length; i++) {
            if (contacto[i] == null) {
                contador++;
            }
        }
        return contador;
    }
    // Mostramos los espacios libres
    public void mostrarEspaciosLibres() {
        int libres = espaciosLibres();
        System.out.println("Espacios libres: " + libres + " de " + contacto.length);
        System.out.println("Ocupados: " + (contacto.length - libres));
    }











}
