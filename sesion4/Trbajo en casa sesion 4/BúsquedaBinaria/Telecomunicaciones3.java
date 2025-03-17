import java.util.Arrays;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Telecomunicaciones3 {
    public static int buscarCliente(int[] clientes, int numero) {
        Arrays.sort(clientes);
        return Arrays.binarySearch(clientes, numero);
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

        int[] clientes = {105, 204, 305, 408, 509};
        int numeroBuscar = 305;

        int indice = buscarCliente(clientes, numeroBuscar);
        System.out.println(indice >= 0 ? "✅ Cliente encontrado en la posición: " + indice : "❌ Cliente no encontrado.");
    }
}
