import java.util.Arrays;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Agropecuario {
    public static boolean buscarPedido(String[] pedidos, String fecha) {
        Arrays.sort(pedidos);
        return Arrays.binarySearch(pedidos, fecha) >= 0;
    }

    public static void main(String[] args) {
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

        String[] pedidos = {"2024-01-10", "2024-02-15", "2024-03-20"};
        String fechaBuscar = "2024-02-15";

        System.out.println(buscarPedido(pedidos, fechaBuscar) ? "✅ Pedido encontrado." : "❌ Pedido no encontrado.");
    }
}
