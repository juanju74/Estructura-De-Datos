package CONVTEMP ; 
import java.util.Scanner;
import java.util.ArrayList ;

public class ConversorTemperaturas {
    public static void main(String[] args) {
        // Lista de ciudades con temperaturas en Celsius
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        ciudades.add(new Ciudad("Bogotá", 15));
        ciudades.add(new Ciudad("Medellín", 22));
        ciudades.add(new Ciudad("Cali", 25));
        ciudades.add(new Ciudad("Barranquilla", 30));
        ciudades.add(new Ciudad("Cartagena", 29));

        // Scanner para entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el nombre de la ciudad
        System.out.print("Ingresa el nombre de la ciudad: ");
        String ciudadBuscada = scanner.nextLine();

        // Buscar la ciudad en la lista
        boolean encontrada = false;
        for (Ciudad ciudad : ciudades) {
            if (ciudad.getNombre().equalsIgnoreCase(ciudadBuscada)) {
                System.out.println("Temperatura en " + ciudad.getNombre() + ": " + ciudad.getTemperatura() + "°C");
                encontrada = true;
                break;
            }
        }

        // Mensaje si la ciudad no fue encontrada
        if (!encontrada) {
            System.out.println("Ciudad no encontrada en la lista.");
        }

        scanner.close();
    
    }
}
