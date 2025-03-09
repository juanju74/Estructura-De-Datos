package Trabajo_en_casa_sesion_5;

public class SolicitudMantenimiento {
    
    private String id;
    private String equipo;
    private String prioridad; // "alta", "media", "baja"
    public SolicitudMantenimiento siguiente;
 
    public SolicitudMantenimiento(String id, String equipo, String prioridad) {
        this.id = id;
        this.equipo = equipo;
        this.prioridad = prioridad.toLowerCase();
        this.siguiente = null;
    }
 
    public String getId() {
        return id;
    }
 
    public String getEquipo() {
        return equipo;
    }
 
    public String getPrioridad() {
        return prioridad;
    }
}
