

import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Agropecuario {

    public static Double obtenerPrimerElemento(Double[] arr) { 
        return arr[0];
    }

    public static double obtenerHumedad() {
        Random rand = new Random();
        return rand.nextDouble() * 100;
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

        Double[] humedad = new Double[24];
        for (int i = 0; i < 24; i++) {
            humedad[i] = obtenerHumedad();
        }
        System.out.println("🌱 La primera lectura de humedad del suelo es: " + obtenerPrimerElemento(humedad) + "%");
    }
}
