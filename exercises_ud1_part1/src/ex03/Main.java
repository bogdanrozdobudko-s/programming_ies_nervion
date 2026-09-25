package ex03;

import java.util.Scanner;
//Escribir una aplicación que pida el año actual y el año de nacimiento del 
//usuario. Debe calcular su edad.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        int age = currentYear - birthYear;

        System.out.println("Your age is: " + age);

        scanner.close();
    }
}

