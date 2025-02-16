import java.util.ArrayList;
import java.util.Scanner;

public class ContarPalabras{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa una oración en minusculas: ");
        String oracion = in.nextLine();
    
        String[] palabras = oracion.toLowerCase().split("\\s+");
    
        ArrayList<String> listaPalabras = new ArrayList<>();
        ArrayList<Integer> conteoPalabras = new ArrayList<>();

        for (String palabra : palabras) {
           
            int buscar= listaPalabras.indexOf(palabra);
            if (buscar != -1) {
                conteoPalabras.set(buscar, conteoPalabras.get(buscar) + 1);
            } else {

                listaPalabras.add(palabra);
                conteoPalabras.add(1);
            }
        }

        System.out.println("\nConteo de palabras:");
        for (int i = 0; i < listaPalabras.size(); i++) {
            System.out.println(listaPalabras.get(i) + ": " + conteoPalabras.get(i));
        }
        
        in.close();

    }
}

