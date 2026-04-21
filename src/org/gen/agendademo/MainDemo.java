package org.gen.agendademo;

import java.util.Scanner;

public class MainDemo {
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
            System.out.println("6. Ver espacios libres y si la agenda está llena");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = -1; // Opción inválida para que caiga en el default
            }

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();

                    Contacto nuevoContacto = new Contacto(nombre, apellido, telefono);
                    // void anadirContacto(Contacto c)
                    agenda.anadirContacto(nuevoContacto);
                    break;

                case 2:
                    System.out.print("Nombre del contacto a verificar: ");
                    String nombreExiste = scanner.nextLine();
                    System.out.print("Apellido del contacto a verificar: ");
                    String apellidoExiste = scanner.nextLine();

                    Contacto contactoExiste = new Contacto(nombreExiste, apellidoExiste, "");

                    // void existeContacto(Contacto c)
                    agenda.existeContacto(contactoExiste);
                    break;

                case 3:
                    // void listarContactos()
                    agenda.listarContactos();
                    break;

                case 4:
                    System.out.print("Nombre del contacto a buscar: ");
                    String nombreBuscar = scanner.nextLine();

                    // void buscaContacto(String nombre)
                    agenda.buscaContacto(nombreBuscar);
                    break;

                case 5:
                    System.out.print("Nombre del contacto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    System.out.print("Apellido del contacto a eliminar: ");
                    String apellidoEliminar = scanner.nextLine();

                    Contacto contactoEliminar = new Contacto(nombreEliminar, apellidoEliminar, "");
                    // void eliminarContacto(Contacto c)
                    agenda.eliminarContacto(contactoEliminar);
                    break;

                case 6:
                    // int espacioLibres()
                    int libres = agenda.espacioLibres();
                    System.out.println("Espacios libres: " + libres + " de 10");

                    // boolean agendaLlena()
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
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
