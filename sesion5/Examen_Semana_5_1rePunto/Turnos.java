package sesion5.Examen_Semana_5_1rePunto;

import java.util.ArrayList;

public class Turnos {
    private ArrayList<Paciente> listaTurnos;

    public Turnos() {
        this.listaTurnos = new ArrayList<>();
        // 🔹 Agregamos pacientes iniciales para pruebas
        listaTurnos.add(new Paciente("Adolf Yurleidy"));
        listaTurnos.add(new Paciente("Diomedes Trump"));
    }

    public void agregarTurno(String nombre) {
        Paciente nuevoPaciente = new Paciente(nombre);
        listaTurnos.add(nuevoPaciente);
    }

    public void atenderPaciente() {
        if (!listaTurnos.isEmpty()) {
            Paciente atendido = listaTurnos.remove(0);
            System.out.println(" Atendiendo a: " + atendido.getNombre());
        } else {
            System.out.println(" No hay pacientes en espera.");
        }
    }

    public void mostrarTurnos() {
        if (listaTurnos.isEmpty()) {
            System.out.println(" No hay turnos pendientes.");
        } else {
            System.out.println(" Turnos pendientes:");
            for (Paciente paciente : listaTurnos) {
                System.out.println(".. " + paciente.getNombre());
            }
        }
    }
}
