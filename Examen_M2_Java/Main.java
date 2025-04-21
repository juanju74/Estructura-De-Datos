import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    
    public static void main(String[] args) {

        String nombre = "Juan David Arboleda Molina";
        String campus = "Campus Cali, U. Cooperativa de Colombia";
        String repositorioGit = "https://github.com/habolanos/ucc-estructuras/blob/master/sesion04/ejercicios/1-algoritmo-O1/PgmAlgoritmoO1.java";

        // Obtener la fecha y hora actual
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaHora = ahora.format(formateador);

        // Imprimir el encabezado
        System.out.println("+----------------------------------------");
        System.out.println("| 👤 Nombre: " + nombre);
        System.out.println("| 🎓 Campus: " + campus);
        System.out.println("| 📅 Fecha y hora: " + fechaHora);
        System.out.println("| 📂 Repositorio Git: " + repositorioGit);
        System.out.println("+----------------------------------------");
        System.out.println();
        
        
        ListaDePrioridad lista = new ListaDePrioridad();

        // Agregar solicitudes
        lista.agregarSolicitud(new Solicitud("Revisión de motor principal", "alta"));
        lista.agregarSolicitud(new Solicitud("Cambio de bombillo", "baja"));
        lista.agregarSolicitud(new Solicitud("Inspección de sensores", "media"));

        System.out.println("\n📋 Antes de procesar:");
        lista.mostrarSolicitudes();

        lista.procesarSolicitud(); // Procesa la más prioritaria

        System.out.println("\n📋 Después de procesar:");
        lista.mostrarSolicitudes();
    }
}
