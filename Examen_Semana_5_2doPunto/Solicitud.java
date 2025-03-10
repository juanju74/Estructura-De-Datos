package Examen_Semana_5_2doPunto;

import java.util.ArrayList;

public class Solicitud {
    private String descripcion;
    private String prioridad;



    public Solicitud(String descripcion, String prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public int getNivelPrioridad() {
        return switch (prioridad.toLowerCase()) {
            case "crítica" -> 3;
            case "importante" -> 2;
            case "general" -> 1;
            default -> 0;
        };
    }

    @Override
    public String toString() {
        return prioridad.toUpperCase() + ": " + descripcion;
    }
}
