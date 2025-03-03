import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Agropecuario {
    public static int encontrarMaximo(int[] datos) {
        int maximo = datos[0];
        for (int num : datos) {
            if (num > maximo) {
                maximo = num;
            }
        }
        return maximo;
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

        int[] produccionLeche = {20, 25, 30, 28, 32, 27, 29};
        System.out.println("🐄 Mayor producción de leche: " + encontrarMaximo(produccionLeche) + " litros");
    }
}
