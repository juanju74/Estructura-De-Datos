package Examen_Semana_5_2doPunto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Soporte soporte = new Soporte();
        int opcion;

        do {
            System.out.println(" MENU GESTION DE SOPORTE ");

            System.out.println("1. Agrega solicitud");

            System.out.println("2. Atender solicitud");

            System.out.println("3. Mostrar las solicitudes pendientes");

            System.out.println("4. Salir");

            System.out.print("Seleccione una opción: ");

            while (!scanner.hasNextInt()) {

                System.out.println("Error: Ingrese un número válido.");

                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la descripción de la solicitud: ");

                    String descripcion = scanner.nextLine();

                    System.out.print("Ingrese de que nivel es su prioridad (Critica/Importante/General): ");

                    String prioridad = scanner.nextLine();

                    soporte.agregarSolicitud(descripcion, prioridad);
                    break;
                case 2:
                    soporte.atenderSolicitud();
                    break;
                case 3:
                    soporte.mostrarSolicitudes();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
