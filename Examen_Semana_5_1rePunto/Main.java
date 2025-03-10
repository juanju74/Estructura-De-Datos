package Examen_Semana_5_1rePunto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turnos gestionTurnos = new Turnos();

        // Encabezado
        String nombre = "Juan Arboleda";
        String campus = "Campus Cali, U. Cooperativa de Colombia";
        String repositorioGit = "https://github.com/juanju74/Estructura-De-Datos";
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaHora = ahora.format(formateador);

        System.out.println("+----------------------------------------");
        System.out.println("| 👤 Nombre: " + nombre);
        System.out.println("| 🎓 Campus: " + campus);
        System.out.println("| 📅 Fecha y hora: " + fechaHora);
        System.out.println("| 📂 Repositorio Git: " + repositorioGit);
        System.out.println("+----------------------------------------\n");

        int opcion;
        do {
            System.out.println("MENU DE GESTION DE TURNOS");
            System.out.println("1. Agrega turno");
            System.out.println("2. Atender un paciente");
            System.out.println("3. Mostrar turnos pendientes");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            while (!scanner.hasNextInt()) {
                System.out.println(" Error Ingrese numero valido.");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine();
      

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del paciente: ");
                    String nombrePaciente = scanner.nextLine();
                    gestionTurnos.agregarTurno(nombrePaciente);
                    break;
                case 2:
                    gestionTurnos.atenderPaciente();
                    break;
                case 3:
                    gestionTurnos.mostrarTurnos();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema..");
                    break;
                default:
                    System.out.println("Opción no valida. Intente nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
