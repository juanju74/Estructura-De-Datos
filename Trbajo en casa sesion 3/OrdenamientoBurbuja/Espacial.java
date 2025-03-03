import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Espacial {
    public static void ordenarTemperaturas(int[] temperaturas) {
        int n = temperaturas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (temperaturas[j] > temperaturas[j + 1]) {
                    int temp = temperaturas[j];
                    temperaturas[j] = temperaturas[j + 1];
                    temperaturas[j + 1] = temp;
                }
            }
        }
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

        int[] temperaturas = {5000, 3000, 7000, 4000, 6000};
        ordenarTemperaturas(temperaturas);

        System.out.println("⭐ Estrellas ordenadas por temperatura:");
        for (int temperatura : temperaturas) {
            System.out.println("   " + temperatura + "K");
        }
    }
}
