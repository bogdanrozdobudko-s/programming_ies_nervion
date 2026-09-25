package ex04;
//Crear una aplicación que calcule la media aritmética de dos notas enteras. 
//Hay que tener en cuenta que la nota media puede tener decimales.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer grade: ");
        int grade1 = scanner.nextInt();

        System.out.print("Enter the second integer grade: ");
        int grade2 = scanner.nextInt();

        double average = (grade1 + grade2) / 2.0;

        System.out.println("The arithmetic mean is: " + average);

        scanner.close();
    }
}

