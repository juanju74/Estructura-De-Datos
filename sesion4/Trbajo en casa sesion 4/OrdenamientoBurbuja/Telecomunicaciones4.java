import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Telecomunicaciones4 {
    public static void ordenarTorres(int[] intensidades) {
        int n = intensidades.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (intensidades[j] < intensidades[j + 1]) {
                    int temp = intensidades[j];
                    intensidades[j] = intensidades[j + 1];
                    intensidades[j + 1] = temp;
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

        int[] intensidades = {40, 90, 60, 75, 30};
        ordenarTorres(intensidades);

        System.out.println("📶 Torres ordenadas por intensidad de señal:");
        for (int i = 0; i < intensidades.length; i++) {
            System.out.println("   Torre " + (i + 1) + " - Intensidad: " + intensidades[i]);
        }
    }
}
