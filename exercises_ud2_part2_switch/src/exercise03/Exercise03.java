package exercise03;

// Escribe un algoritmo que le pida al usuario dos números. 
// A continuación debe mostrar el siguiente menú por pantalla:
// SUMAR LOS NÚMEROS
// RESTAR LOS NÚMEROS
// MULTIPLICAR LOS NÚMEROS
// DIVIDIR LOS NÚMEROS

import java.util.Scanner;


public class Exercise03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Scanner operation = new Scanner(System.in);
    
    System.out.print("Intoduce el primer número: ");
    float n1 = input.nextFloat();
    System.out.print("Intoduce el segundo número: ");
    float n2 = input.nextFloat();
    
    System.out.println("============ CALCULADOR SIMPLE ============");
    System.out.println("/ SUMAR LOS NÚMEROS (+)");
    System.out.println("/ RESTAR LOS NÚMEROS (-)");
    System.out.println("/ MULTIPLICAR LOS NÚMEROS (*)");
    System.out.println("/ DIVIDIR LOS NÚMEROS (/)");
    System.out.println("===========================================");
    System.out.print("Tu respusta: ");
    String answer = operation.nextLine();
    
    switch (answer) {
    
    case "+":
      System.out.println("Resultado: " + n1 + n2);
      break;
    case "-":
      System.out.println("Resultado: " + (n1 - n2));
      break;
    case "*":
      System.out.println("Resultado: " + n1 * n2);
      break;
    case "/":
      System.out.println("Resultado: " + n1 / n2);
      break;
    default:
      System.out.println("Operación no válida.");
      break;
    }
    
    input.close();
    operation.close();
  }
}
