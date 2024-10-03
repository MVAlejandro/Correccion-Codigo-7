import java.util.HashMap; // Se agrega la clase HashMap
import java.util.Scanner; // Se agrega la clase Scanner

public class Codigo7 {
	public static void main(String[] args) { // Se agrega el método main
		Scanner s = new Scanner(System.in); // Se le agrega el tipo de input al scanner

	    HashMap<String, String> capitales = new HashMap<>(); // Se cambian los tipos de variables para coinicidir con lo que ya se introdujo después
	    													 // También se completa el nombre del mapa
	    capitales.put("Canadá", "Ottawwa"); // Se corrige la capital
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa Rica", "San José"); // Se corrige el nombre del país
	    capitales.put("El Salvador", "San Salvador"); // Faltaba agregar su capital
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	   
	    String c = ""; // Se corrige la palabra String
	    
	    do {
	      System.out.print("Escribe el nombre de un país y te diré su capital: "); // Se corrige el System.out.print
	      c = s.nextLine(); // Se cambia el tipo de scaneo para string
	      
	      if (!c.equals("salir")) { // se corrige equals
	        if (capitales.containsKey(c)) { // Se nombra correctamente al mapa, y se cambia Values por Key
	          System.out.print("La capital de " + c); // Se agrega el out para que funcione
	          System.out.println(" es " + capitales.get(c)); // Se nombra correctamente al mapa y se cambia put por get para obtener el valor
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String ca = s.nextLine();
	          capitales.put(c, ca); // Nombrar correctamente el mapa
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        } // else
	      } // if
	    } while (!c.equals("salir")); // Correción de la palabra while y agregar el cierre de parentesis
	    	System.out.println("Hasta luego"); // Se agrega un mensaje para indicar que el programa finalizó
	    	
	    s.close(); // Se cierra el scanner
	    
	} // main
} // class Codigo7