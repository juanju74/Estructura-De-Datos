import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Agropecuario {

    public static double sumarElementos(double[] arr) {
        double suma = 0;
        for (double num : arr) {
            suma += num;
        }
        return suma;
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

        double[] pesosGanado = new double[20]; // 20 animales en el corral
        Random rand = new Random();

        for (int i = 0; i < pesosGanado.length; i++) {
            pesosGanado[i] = rand.nextDouble() * 500 + 100; // Peso entre 100kg y 600kg
        }

        System.out.println("El peso total del ganado es: " + sumarElementos(pesosGanado) + " kg");
    }
}
