package exercise01;

// Pedir una nota entera de 0 a 10 y mostrarla de la 
// siguiente forma: insuficiente (de 0 a 4), suficiente (5)
// , bien (6), notable (7 y 8) y sobresaliente (9 y 10).

import java.util.Scanner;

public class Exercise01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Introduce tu nota: ");
    int note = input.nextInt();
    
    switch (note) {
    
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
        System.out.println("Insuficiente.");
        break;
      case 5:
        System.out.println("Suficiente.");
        break;
      case 6:
    	System.out.println("Bien.");
    	break;
      case 7:
      case 8:
    	System.out.println("Notable.");
    	break;
      case 9:
      case 10:
    	System.out.println("Sobresaliente.");
    	break;
      default:
    	System.out.println("Nota NO válida.");
    }
    
    input.close();
  }
} 
