package ex09;
//Realizar una aplicación que solicite al usuario su edad y le indique si es 
//mayor de edad (mediante un literal booleano: true o false).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        boolean legalAge = age >= 18;

        System.out.println(legalAge);

        scanner.close();
    }
}

