package ex06;
//Escribir un programa que le pida dos números al usuario. A continuación, 
//debe mostrar la suma, la resta, la multiplicación y la división de ambos 
//números. Debe mostrarse el resultado de cada operación en una línea 
//distinta.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));

        scanner.close();
    }
}

