    package sesion5.Examen_Semana_5_2doPunto;

    import java.util.ArrayList;

    public class Soporte {
        private ArrayList<Solicitud> solicitudes;

        public Soporte() {
            solicitudes = new ArrayList<>();
            
            //Solicitudes de prueba

            solicitudes.add(new Solicitud("Crítica", "Servidor caído"));
            solicitudes.add(new Solicitud("Importante", "Actualización de software"));
            solicitudes.add(new Solicitud("General", "Soporte de usuario"));
        }

        public void agregarSolicitud(String descripcion, String prioridad) {
            Solicitud nuevaSolicitud = new Solicitud(descripcion, prioridad);
            int index = 0;

            
            for (; index < solicitudes.size(); index++) {
                if (solicitudes.get(index).getNivelPrioridad() < nuevaSolicitud.getNivelPrioridad()) {
                    break;
                }
            }
            
            
            solicitudes.add(index, nuevaSolicitud);
            System.out.println("Solicitud agregada: " + nuevaSolicitud);
        }

        public void atenderSolicitud() {
            if (!solicitudes.isEmpty()) {
                Solicitud atendida = solicitudes.remove(0);
                System.out.println("Atendiendo solicitud: " + atendida);
            } else {
                System.out.println("No hay solicitudes pendientes.");
            }
        }

        public void mostrarSolicitudes() {
            if (solicitudes.isEmpty()) {
                System.out.println("No hay solicitudes en la cola.");
            } else {
                System.out.println("Solicitudes en espera:");
                for (Solicitud s : solicitudes) {
                    System.out.println(s);
                }
            }
        }
    }
