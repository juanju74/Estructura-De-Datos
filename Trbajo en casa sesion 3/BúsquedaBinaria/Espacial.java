import java.util.Arrays;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Espacial {
    public static int buscarImagen(String[] imagenes, String id) {
        Arrays.sort(imagenes);
        return Arrays.binarySearch(imagenes, id);
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

        String[] imagenes = {"IMG001", "IMG002", "IMG003", "IMG004"};
        String buscar = "IMG003";

        int indice = buscarImagen(imagenes, buscar);
        System.out.println(indice >= 0 ? "✅ Imagen encontrada en la posición: " + indice : "❌ Imagen no encontrada.");
    }
}
