
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Salud {

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

        String[] citas = {"Ana Pérez", "Carlos Gómez", "Luis Ramírez"};
        System.out.println("🩺 El primer paciente del día es: " + obtenerPrimerElemento(citas));
    }
}
