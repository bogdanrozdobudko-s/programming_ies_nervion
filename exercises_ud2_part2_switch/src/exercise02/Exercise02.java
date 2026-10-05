package exercise02;

// Idear un programa que solicite al usuario un número comprendido entre 1 y 7, 
// correspondiente a un día de la semana. Se debe mostrar el nombre del día de 
// la semana al que corresponde. Por ejemplo, el número 1 corresponde a “Lunes” 
// el 6 a “Sábado”.

import java.util.Scanner;

public class Exercise02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Introduce un número: ");
    int num = input.nextInt();
    
    switch (num) {
      case 1:
    	System.out.println("Lunes.");
    	break;
      case 2:
        System.out.println("Martes.");
        break;
      case 3:
    	System.out.println("Miércoles.");
    	break;
      case 4:
    	System.out.println("Jueves.");
    	break;
      case 5:
    	System.out.println("Viernes.");
    	break;
      case 6:
    	System.out.println("Sábado.");
    	break;
      case 7:
    	System.out.println("Domingo.");
    	break;
      default:
    	System.out.println("Día no válido.");
    	break;
    }
    
    input.close();
  }
}
