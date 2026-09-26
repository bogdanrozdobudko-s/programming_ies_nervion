package ex10;
//Solicita al usuario un año. Calcula mediante una expresión booleana si el 
//año es bisiesto. Muestra el resultado como true o false.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        System.out.println(isLeapYear);

        scanner.close();
    }
}

