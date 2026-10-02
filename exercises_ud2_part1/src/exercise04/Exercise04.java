package exercise04;
// Implementar un programa que pida por teclado un número decimal 
// e indique si es un número casi-cero, que son aquellos, positivos 
// o negativos, que se acercan a 0 por menos de 1 unidad, aunque 
// curiosamente el 0 no se considera un número casi-cero. Es decir, 
// un número casi-cero es el que se encuentra en el intervalo (-1, 1), 
// donde se excluye el -1, el 0 y el 1.

import java.util.Scanner;

public class Exercise04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a decimal number (use ','): ");
    float num = input.nextFloat();
    
    if (num > -0.9 && num < 0.9 && num != 0) {
      System.out.println("The number is almost-zero.");
    } else {
      System.out.println("The number is NOT almost-zero.");
    }
    
    input.close();
  }
}
