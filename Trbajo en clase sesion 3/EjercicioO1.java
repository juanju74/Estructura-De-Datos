// Datos del encabezado
String nombre = "Harold Adrian";
String campus = "Campus Cali, U. Cooperativa de Colombia";
String repositorioGit = "https://github.com/habolanos/ucc-estructuras/blob/master/sesion04/ejercicios/1-algoritmo-O1/PgmAlgoritmoO1.java";

// Obtener la fecha y hora actual
LocalDateTime ahora = LocalDateTime.now();
DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
String fechaHora = ahora.format(formateador);

// Imprimir el encabezado
System.out.println("+----------------------------------------") ;
System.out.println("| 👤 Nombre: " + nombre) ;
System.out.println("| 🎓 Campus: " + campus) ; 
System.out.println("| 📅 Fecha y hora: " + fechaHora) ;
System.out.println("| 📂 Repositorio Git: " + repositorioGit) ;
System.out.println("+----------------------------------------") ;
System.out.println();
    
import java.util.Scanner;
 
public class EjercicioO1 {
    public static int obtenerPrimerElemento(int[] arr) {
        return arr[0];
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
 
        System.out.println("Ingrese los elementos del array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
 
        System.out.println("El primer elemento del array es: " + obtenerPrimerElemento(arr));
    }
}
