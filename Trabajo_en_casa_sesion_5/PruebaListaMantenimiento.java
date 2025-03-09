package Trabajo_en_casa_sesion_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PruebaListaMantenimiento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<PersonaQueIngresaAlSistema> listaUsuarios = new ArrayList<>();

        // Registrar usuarios antes de procesar solicitudes de mantenimiento

        System.out.println("+--------------------------------------------------------+");
        
        System.out.print("Ingrese la cantidad de usuarios a registrar: ");

        int cantidadUsuarios = scanner.nextInt();

        scanner.nextLine(); // Consumir la nueva línea

        for (int i = 0; i < cantidadUsuarios; i++) {

            System.out.println("\nIngrese los datos del usuario " + (i + 1) + ":");
            
            System.out.print(" ✏️ Nombre:  ");
            String nombre = scanner.nextLine();

            System.out.print(" 🚹 Cédula : ");
            String cedula = scanner.nextLine();

            System.out.print("📍 ID dentro de la empresa: ");
            String idEmpresa = scanner.nextLine();

            System.out.print(" 🛂 Cargo: ");
            String cargo = scanner.nextLine();

            listaUsuarios.add(new PersonaQueIngresaAlSistema(nombre, cedula, idEmpresa, cargo));
        }

        System.out.println("+--------------------------------------------------------+");

        // Ahora procedemos con las solicitudes de mantenimient
        
        ListaEnlazadaMantenimiento lista = new ListaEnlazadaMantenimiento();


        System.out.println("Agregando solicitudes de mantenimiento...");
        
        lista.agregarSolicitud("🆔 M001", "Bomba de Agua🚰", "media📛");

        lista.agregarSolicitud("🆔 M002", "Generador Principal⚙️", "alta⚠️");

        lista.agregarSolicitud("🆔 M003", "Sistema de Ventilación💨", "baja👣");

        lista.agregarSolicitud("🆔 M004", "Sensor de Gas📡", "alta⚠️");

        // Mostrar solicitudes pendientes

        System.out.println("\n 📋 Solicitudes pendientes:");

        lista.mostrarSolicitudes();

        // Procesar la solicitud más prioritaria
    
        System.out.println("\nProcesando la solicitud más prioritaria...");

        SolicitudMantenimiento procesada = lista.procesarSolicitud();

        System.out.println("Solicitud procesada: ID: " + procesada.getId() + ", Equipo: " + procesada.getEquipo());

        // Mostrar solicitudes pendientes después del procesamiento

        System.out.println("\nSolicitudes pendientes después del procesamiento:");

        lista.mostrarSolicitudes();

        scanner.close();
    }
}
