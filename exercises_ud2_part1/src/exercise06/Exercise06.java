package exercise06;
// Escribir una aplicación que indique cuántas cifras 
// tiene un número introducido por teclado, que está 
// comprendido entre 0 y 99999. 

import java.util.Scanner;

public class Exercise06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    int num = input.nextInt();
    
    int length = String.valueOf(num).length();
    
    if (length > 5) {
      System.err.println("Too large number!");
      System.exit(1);
    }
    
    System.out.println("Number of digits: " + length);
    
    input.close();
  }
}
