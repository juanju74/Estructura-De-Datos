import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PruebaListaEnlazada {

    public static void main(String[] args) {

        
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
        
        ListaEnlazadaTransacciones lista = new ListaEnlazadaTransacciones();

 

        // Agregar transacciones

        lista.agregarTransaccion("T001", 500.0, "deposito");

        lista.agregarTransaccion("T002", 200.0, "retiro");

        lista.agregarTransaccion("T003", 1000.0, "deposito");

 

        // Mostrar transacciones pendientes

        System.out.println("Transacciones pendientes:");

        lista.mostrarTransacciones();

 

        // Procesar una transacción

        Transaccion procesada = lista.procesarTransaccion();

        System.out.println("\nTransacción procesada: ID: " + procesada.getId());

 

        // Mostrar transacciones pendientes después del procesamiento

        System.out.println("\nTransacciones pendientes:");

        lista.mostrarTransacciones();

    }

}