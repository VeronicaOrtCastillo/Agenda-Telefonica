package agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda(); // usa tamaño por defecto: 10
        int opcion;

        do {
            System.out.println("\n===== MENÚ AGENDA =====");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Verificar si existe contacto");
            System.out.println("3. Listar contactos");
            System.out.println("4. Buscar contacto por nombre");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Ver si la agenda está llena");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();

                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();

                    Contacto nuevoContacto = new Contacto(nombre, apellido, telefono);
                    agenda.añadirContacto(nuevoContacto);
                    break;

                case 2:
                    System.out.print("Nombre del contacto a verificar: ");
                    String nombreExiste = scanner.nextLine();

                    Contacto contactoExiste = new Contacto(nombreExiste, "", "");
                    boolean existe = agenda.existeContacto(contactoExiste);

                    if (existe) {
                        System.out.println("El contacto sí existe.");
                    } else {
                        System.out.println("El contacto no existe.");
                    }
                    break;

                case 3:
                    agenda.listarContactos();
                    break;

                case 4:
                    System.out.print("Nombre del contacto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    agenda.buscarContacto(nombreBuscar);
                    break;

                case 5:
                    System.out.print("Nombre del contacto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();

                    Contacto contactoEliminar = new Contacto(nombreEliminar, "", "");
                    agenda.eliminarContacto(contactoEliminar);
                    break;

                case 6:
                    if (agenda.agendaLlena()) {
                        System.out.println("La agenda está llena.");
                    } else {
                        System.out.println("La agenda aún tiene espacio.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                    default:
                        System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
