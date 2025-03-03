
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Espacial {

    public static Double obtenerPrimerElemento(Double[] arr) { 
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

        Double[] temperaturas = {-60.5, -55.2, -53.8};
        System.out.println("🚀 La primera temperatura registrada en Marte es: " + obtenerPrimerElemento(temperaturas) + "°C");
    }
}
