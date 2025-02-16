public class Main {
  public static void main(String[] args) {
      DiccionarioDePersona diccionario = new DiccionarioDePersona();

      // contactos
      diccionario.agregarPersona("Gadiel", "3168787404");
      diccionario.agregarPersona("Juan", "3168923426");
      diccionario.agregarPersona("Laura", "3153100685");

      //busqueda de numeros
      System.out.println("Número de Gadiel: " + diccionario.buscarNumero("Juan"));
      System.out.println("Número de Juan: " + diccionario.buscarNumero("Juan"));
      System.out.println("Número de Laura: " + diccionario.buscarNumero("Laura"));
      System.out.println("Número de Manuel: " + diccionario.buscarNumero("Manuel"));
  }
}

 
    
