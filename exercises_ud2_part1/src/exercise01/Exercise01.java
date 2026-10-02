package exercise01;

import java.util.Scanner;

// Diseñar una aplicación que solicite al usuario 
// un número e indique si es par o impar.

public class Exercise01 {
  public static boolean isEven(int num) {
    if (num % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an integer number: ");
    int number = input.nextInt();
    
    if (isEven(number)) {
      System.out.println("The number " + number + " is even.");
    } else {
      System.out.println("The number " + number + " is odd.");
    }
    
    input.close();
  }
}
