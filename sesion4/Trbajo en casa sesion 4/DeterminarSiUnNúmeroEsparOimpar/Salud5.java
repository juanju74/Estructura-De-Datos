import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Salud5 {
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
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

        int codigoMedicamento = 12345;
        System.out.println("💊 Código de medicamento " + codigoMedicamento + " es " + (esPar(codigoMedicamento) ? "PAR" : "IMPAR"));
    }
}
