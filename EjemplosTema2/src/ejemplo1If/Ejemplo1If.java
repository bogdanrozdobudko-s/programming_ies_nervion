package ejemplo1If;

import java.util.Scanner;

public class Ejemplo1If {
  public static boolean isEven(int num) {
    if (num % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = input.nextInt();

    if (isEven(num)) {
      System.out.println("Is even.");
    } else {
      System.out.println("Is odd.");
    }
    
    input.close();
  }
}