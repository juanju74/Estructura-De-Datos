// Juan David Arboleda Molina.Estructura De Datos.2025.17/02/2025.CAMPUS CALI.UNIVERSIDAD COOPERATIVA DE COLOMBIA

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompras {
    
    public static void main(String[] args) {
       
        ArrayList<String> listaDeCompras = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Lista de compras");
        while (true) {
            System.out.print("Ingresa un elemento para agregar a la lista o escribe 'salir' para terminar: ");
            String item = in.nextLine();

           
            if (item.equalsIgnoreCase("salir")) {
                break;
            }

            listaDeCompras.add(item); 
            System.out.println("Elemento '" + item + "' agregado a la lista de compras.");
        }

        
        System.out.println("\nLa lista de compras es:");
        for (String product : listaDeCompras) {
            System.out.println("- " + product);
        }

        System.out.print("\nIngresa el produto que deseas eliminar: ");
        String delete = in.nextLine();

        if (listaDeCompras.contains(delete)) {
            listaDeCompras.remove(delete);
            System.out.println("Producto '" + delete + "' eliminado de la lista de compras.");
        } else {
            System.out.println("El producto '" + delete + "' no se encuentra.");
        }

        System.out.println("\nLista de compras actualizada:");
        for (String product : listaDeCompras) {
            System.out.println("- " + product);
        }
         
        in.close();

    }
}
