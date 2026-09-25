package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double number = input.nextDouble();

        int rounded;
        if (number >= 0) {
            rounded = (int) (number + 0.5);
        } else {
            rounded = (int) (number - 0.5);
        }

        System.out.println("Rounded number: " + rounded);
        
        input.close();
    }
}

