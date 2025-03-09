import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Salud4 {
    public static void ordenarPacientes(int[] prioridades, String[] pacientes) {
        int n = prioridades.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (prioridades[j] > prioridades[j + 1]) {
                    // Intercambiar prioridades
                    int temp = prioridades[j];
                    prioridades[j] = prioridades[j + 1];
                    prioridades[j + 1] = temp;
                    
                    // Intercambiar nombres de pacientes
                    String tempNombre = pacientes[j];
                    pacientes[j] = pacientes[j + 1];
                    pacientes[j + 1] = tempNombre;
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

        int[] prioridades = {3, 1, 4, 2};
        String[] pacientes = {"Carlos", "Ana", "Elena", "Beatriz"};

        ordenarPacientes(prioridades, pacientes);

        System.out.println("📋 Pacientes ordenados por prioridad:");
        for (int i = 0; i < pacientes.length; i++) {
            System.out.println("   " + pacientes[i] + " - Prioridad: " + prioridades[i]);
        }
    }
}
