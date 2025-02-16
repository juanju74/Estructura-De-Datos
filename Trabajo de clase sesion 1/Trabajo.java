import java.util.Scanner;

public class Trabajo {
    public static void main(String[] args) {
         //arreglo
        Scanner maquinaNum = new Scanner(System.in);
        int[] num = new int[5]; 
       
        System.out.println("Ingrese 5 números:");
        //ingrese numeros
        for (int i = 0; i < 5; i++) {
            System.out.print("num " + (i + 1) + ":");
            num[i] = maquinaNum.nextInt();
        }
        int mayor = num[0];
        int menor = num[0];
        for (int x = 1; x < 5; x++) {
            if (num[x] > mayor) {
                mayor = num[x];
            }
            if (num[x] < menor) {
                menor = num[x];
            }
        }
        System.out.println("El mayor número es: " + mayor);
        System.out.println("El menor número es: " + menor);
        maquinaNum.close();
    }
}