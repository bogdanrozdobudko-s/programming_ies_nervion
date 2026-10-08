package exercise07;
//Realiza un programa en java que pida un número entero positivo y nos diga 
//si es primo o no.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        boolean isPrime = number >= 2;

        for (int divisor = 2; divisor < number && isPrime; divisor++) {
            if (number % divisor == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }

        input.close();
    }
}
