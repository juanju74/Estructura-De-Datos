import java.util.LinkedList;

class Solicitud {
    String descripcion;
    String prioridad;

    public Solicitud(String descripcion, String prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad.toLowerCase(); // Asegura consistencia
    }

    @Override
    public String toString() {
        return "[" + prioridad.toUpperCase() + "] " + descripcion;
    }
}

class ListaDePrioridad {
    LinkedList<Solicitud> solicitudes = new LinkedList<>();

    // Inserta según prioridad (Alta primero, luego Media, luego Baja)
    public void agregarSolicitud(Solicitud nueva) {
        int index = 0;
        for (Solicitud s : solicitudes) {
            if (compararPrioridad(nueva.prioridad, s.prioridad) < 0) {
                break;
            }
            index++;
        }
        solicitudes.add(index, nueva);
    }

    // Compara prioridades: menor valor = más prioridad
    private int compararPrioridad(String p1, String p2) {
        return obtenerNivel(p1) - obtenerNivel(p2);
    }
    private int obtenerNivel(String prioridad) {
        switch (prioridad.toLowerCase()) {
            case "alta":
                return 1;
            case "media":
                return 2;
            case "baja":
                return 3;
            default:
                return 4;
        }
    }
    
    public void mostrarSolicitudes() {
        if (solicitudes.isEmpty()) {
            System.out.println("No hay solicitudes pendientes.");
        } else {
            solicitudes.forEach(System.out::println);
        }
    }

    public void procesarSolicitud() {
        if (!solicitudes.isEmpty()) {
            Solicitud procesada = solicitudes.removeFirst();
            System.out.println("✅ Procesando: " + procesada);
        } else {
            System.out.println("⛔ No hay solicitudes para procesar.");
        }
    }
}
