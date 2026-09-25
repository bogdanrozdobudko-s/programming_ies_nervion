package ex6;

import java.util.Scanner;

public class q {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in millimeters: ");
        double millimeters = scanner.nextDouble();

        System.out.print("Enter the distance in centimeters: ");
        double centimeters = scanner.nextDouble();

        System.out.print("Enter the distance in meters: ");
        double meters = scanner.nextDouble();

        double sum = millimeters / 10 + centimeters + meters * 100;

        System.out.println("The sum of the three lengths in centimeters is: " + sum);

        scanner.close();
    }
}

