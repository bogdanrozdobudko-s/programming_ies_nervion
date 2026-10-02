package exercise02;
// Escribir un programa que pida al usuario tres números enteros, 
// y que muestre por pantalla el mayor de los 3. 
// Supondremos que los tres números son distintos.

import java.util.Scanner;

public class Exercise02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int a, b, c, major;
    
    System.out.print("Enter the first number: ");
    a = input.nextInt();
    
    System.out.print("Enter the second number: ");
    b = input.nextInt();
    
    System.out.print("Enter the third number: ");
    c = input.nextInt();
    
    if (a < b) {
      major = b;
    } else {
      major = a;
    }
    
    if (major < c) {
      major = c;
    }
    
    System.out.println("The major number is: " + major);
    
    input.close();
  }
}
