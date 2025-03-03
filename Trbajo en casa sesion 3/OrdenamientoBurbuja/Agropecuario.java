import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Agropecuario {
    public static void ordenarParcelas(String[] parcelas) {
        int n = parcelas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (parcelas[j].compareTo(parcelas[j + 1]) > 0) {
                    String temp = parcelas[j];
                    parcelas[j] = parcelas[j + 1];
                    parcelas[j + 1] = temp;
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

        String[] parcelas = {"2024-05-20", "2024-03-15", "2024-06-10", "2024-04-05"};
        ordenarParcelas(parcelas);

        System.out.println("🌱 Parcelas ordenadas por fecha de siembra:");
        for (String parcela : parcelas) {
            System.out.println("   " + parcela);
        }
    }
}
