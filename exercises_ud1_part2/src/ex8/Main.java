package ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the throw length in meters: ");
        double meters = scanner.nextDouble();

        int centimeters = (int) (meters * 100);

        System.out.println(centimeters);

        scanner.close();
    }
}

