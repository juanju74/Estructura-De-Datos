import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaccion {

    private String id;

    private double monto;

    private String tipo; // "deposito" o "retiro"

    public Transaccion siguiente;

 

    public Transaccion(String id, double monto, String tipo) {

        this.id = id;

        this.monto = monto;

        this.tipo = tipo;

        this.siguiente = null;

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
    }

    public String getId() {

        return id;

    }

 

    public double getMonto() {

        return monto;

    }

 

    public String getTipo() {

        return tipo;

    }

}