package ex10;
//Escribir un programa que pida un número al usuario e indique mediante un 
//literal booleano (true o false) si el número es par.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        boolean isEven = number % 2 == 0;
        System.out.println(isEven);

        scanner.close();
    }
}

