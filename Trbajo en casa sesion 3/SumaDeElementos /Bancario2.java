import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bancario2 {

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

        double[] depositos = new double[15]; // 15 depósitos realizados en el día
        Random rand = new Random();

        for (int i = 0; i < depositos.length; i++) {
            depositos[i] = rand.nextDouble() * 10000; // Entre 0 y 10,000 $
        }

        System.out.println("El total de depósitos realizados hoy es: $" + sumarElementos(depositos));
    }
}
