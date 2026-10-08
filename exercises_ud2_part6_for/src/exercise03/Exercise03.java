package exercise03;
//Pedir diez números por teclado y mostrar la media.

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            double number = input.nextDouble();
            sum += number;
        }

        double average = sum / 10;

        System.out.println("Average: " + average);

        input.close();
    }
}
