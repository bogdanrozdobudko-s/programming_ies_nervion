package exercise05;
// Pedir los coeficientes de una ecuación de segundo grado 
// y mostrar sus soluciones reales. Si no existen, habrá que 
// indicarlo. Hay que tener en cuenta que las soluciones de 
// una ecuación de segundo grado
// ax2 + bx + c = 0

import java.util.Scanner;

public class Exercise05 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("First coefficient: ");
    double a = input.nextDouble();
    System.out.print("Second coefficient: ");
    double b = input.nextDouble();
    System.out.print("Third coefficient: ");
    double c = input.nextDouble();
    
    double discriminant = (b * b) - (4 * a * c);
    
    if (discriminant > 0) {
      double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
      double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
      
      System.out.println(x1);
      System.out.println(x2);
    } else if (discriminant == 0) {
      double x = -b / (2 * a);
      
      System.out.println(x);
    } else {
      System.err.println("Err.");
      System.exit(1);
    }
    
    input.close();
  }
}
