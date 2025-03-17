// Juan David Arboleda Molina.Estructura De Datos.2025.17/02/2025.CAMPUS CALI.UNIVERSIDAD COOPERATIVA DE COLOMBIA

import java.util.ArrayList;

class DiccionarioDePersona {
    private ArrayList<Persona> Personas;

    public DiccionarioDePersona() {
        Personas = new ArrayList<>();

    }

    // metodo para agragar contacto
    public void agregarPersona(String nombre, String telefono) {
        Persona nuevoContacto = new Persona(nombre, telefono);
        Personas.add(nuevoContacto);
    }

    // metodo para el nombre del contacto
    public String buscarNumero(String nombre) {
        for (Persona Persona : Personas) {
            if (Persona.getNombre().equalsIgnoreCase(nombre)) {
                return Persona.getTelefono();
            }
        }
        return null; //no se encuentra el contacto
    }
}