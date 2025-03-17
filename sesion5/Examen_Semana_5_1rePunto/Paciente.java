

package sesion5.Examen_Semana_5_1rePunto;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Paciente {
    private String nombre;
    private String horaLlegada;

    public Paciente(String nombre) {
        this.nombre = nombre;
        this.horaLlegada = obtenerHoraActual();
    }

    private String obtenerHoraActual() {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss");
        return ahora.format(formateador);
    }

    public String getNombre() {
        return nombre;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    @Override
    public String toString() {
        return nombre + " (Llego a las " + horaLlegada + ")";
    }
}
