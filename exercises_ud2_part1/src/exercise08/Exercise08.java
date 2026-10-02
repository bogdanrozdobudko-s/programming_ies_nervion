package exercise08;
// Escribir un programa que pida al usuario tres números 
// enteros, y que muestre por pantalla si la suma de dos 
// de esos números da como resultado el otro número.

import java.util.Scanner;

public class Exercise08 {
  public static void main(String[] args) {
    int num0, num1, num2;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the first number: ");
    num0 = input.nextInt();
    
    System.out.print("Enter the second number: ");
    num1 = input.nextInt();
    
    System.out.print("Enter the third number: ");
    num2 = input.nextInt();
    
    if (num0 + num1 == num2) {
      System.out.println("The sum of " + num0 + " and " + num1 + " is the third number.");
    } else {
      System.err.println("The first two number don't give the third one.");
    }
    
    input.close();
  }
}
