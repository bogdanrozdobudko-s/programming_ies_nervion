package exercise05;
//Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se 
//denota 5! y es igual a 5x4x3x2x1 = 120.
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);

        input.close();
    }
}
