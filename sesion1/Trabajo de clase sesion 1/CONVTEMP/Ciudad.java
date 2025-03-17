package CONVTEMP ; 
public class Ciudad {
    private String nombre;
    private int temperatura;

    public Ciudad(String nombre, int temperatura) {
        this.nombre = nombre;
        this.temperatura = temperatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }
}
