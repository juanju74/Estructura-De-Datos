import java.util.Arrays;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bancario3 {
    public static int buscarClienteRiesgo(int[] transacciones, int monto) {
        Arrays.sort(transacciones);
        return Arrays.binarySearch(transacciones, monto);
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

        int[] transacciones = {1000, 5000, 10000, 20000, 50000};
        int montoBuscar = 10000;

        int indice = buscarClienteRiesgo(transacciones, montoBuscar);
        System.out.println(indice >= 0 ? "✅ Cliente sospechoso encontrado en posición: " + indice : "❌ Cliente no encontrado.");
    }
}
