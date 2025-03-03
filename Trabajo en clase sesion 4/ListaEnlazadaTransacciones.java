import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ListaEnlazadaTransacciones {

    private Transaccion cabeza;

 

    public ListaEnlazadaTransacciones() {

        this.cabeza = null;

    }

 

    // Agregar una transacción al final de la lista
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
    public void agregarTransaccion(String id, double monto, String tipo) {

        Transaccion nueva = new Transaccion(id, monto, tipo);

        if (cabeza == null) {

            cabeza = nueva;

        } else {

            Transaccion temp = cabeza;

            while (temp.siguiente != null) {

                temp = temp.siguiente;

            }

            temp.siguiente = nueva;

        }

    }

 

    // Procesar la primera transacción de la lista

    public Transaccion procesarTransaccion() {

        if (cabeza == null) {

            return null;

        }

        Transaccion procesada = cabeza;

        cabeza = cabeza.siguiente;

        return procesada;

    }

 

    // Mostrar todas las transacciones pendientes

    public void mostrarTransacciones() {

        Transaccion temp = cabeza;

        while (temp != null) {

            System.out.println("ID: " + temp.getId() + ", Monto: " + temp.getMonto() + ", Tipo: " + temp.getTipo());

            temp = temp.siguiente;

        }

    }

}