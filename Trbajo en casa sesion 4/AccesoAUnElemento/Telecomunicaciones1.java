
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Telecomunicaciones1 {

    public static String obtenerPrimerElemento(String[] arr) { 
        return arr[0];
    }

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

        String[] routers = {"Router_A", "Router_B", "Router_C"};
        System.out.println("📡 El primer router activo es: " + obtenerPrimerElemento(routers));
    }
}
