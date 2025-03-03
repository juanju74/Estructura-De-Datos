import java.util.Arrays;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Salud {
    public static int buscarDiagnostico(String[] historial, String diagnostico) {
        Arrays.sort(historial);  // Asegurar que el array está ordenado
        return Arrays.binarySearch(historial, diagnostico);
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

        String[] historial = {"Diabetes", "Hipertensión", "Migraña", "Neumonía"};
        String buscar = "Migraña";

        int indice = buscarDiagnostico(historial, buscar);
        System.out.println(indice >= 0 ? "✅ Diagnóstico encontrado en la posición: " + indice : "❌ Diagnóstico no encontrado.");
    }
}
