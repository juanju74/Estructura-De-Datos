package Trabajo_en_casa_sesion_5;
public class PruebaListaMantenimiento {
    public static void main(String[] args) {
        ListaEnlazadaMantenimiento lista = new ListaEnlazadaMantenimiento();
 
        // Agregar solicitudes de mantenimiento con diferentes prioridades
        lista.agregarSolicitud("M001", "Bomba de Agua", "media");
        lista.agregarSolicitud("M002", "Generador Principal", "alta");
        lista.agregarSolicitud("M003", "Sistema de Ventilación", "baja");
        lista.agregarSolicitud("M004", "Sensor de Gas", "alta");
 
        // Mostrar solicitudes pendientes
        System.out.println("Solicitudes pendientes:");
        lista.mostrarSolicitudes();
 
        // Procesar la solicitud más prioritaria
        SolicitudMantenimiento procesada = lista.procesarSolicitud();
        System.out.println("\nSolicitud procesada: ID: " + procesada.getId() + ", Equipo: " + procesada.getEquipo());
 
        // Mostrar solicitudes pendientes después del procesamiento
        System.out.println("\nSolicitudes pendientes:");
        lista.mostrarSolicitudes();
    }
}
