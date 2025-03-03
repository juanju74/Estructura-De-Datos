import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bancario {
    public static void ordenarClientes(String[] clientes, double[] ingresos) {
        int n = ingresos.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ingresos[j] < ingresos[j + 1]) {
                    // Intercambiar ingresos
                    double tempIngreso = ingresos[j];
                    ingresos[j] = ingresos[j + 1];
                    ingresos[j + 1] = tempIngreso;

                    // Intercambiar nombres de clientes
                    String tempCliente = clientes[j];
                    clientes[j] = clientes[j + 1];
                    clientes[j + 1] = tempCliente;
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

        String[] clientes = {"Carlos", "Ana", "Beatriz", "Elena", "Daniel"};
        double[] ingresos = {3500.0, 7200.5, 4800.0, 2900.0, 6000.0};

        ordenarClientes(clientes, ingresos);

        System.out.println("🏦 Clientes ordenados por nivel de ingresos:");
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("   " + clientes[i] + " - Ingresos: $" + ingresos[i]);
        }
    }
}
