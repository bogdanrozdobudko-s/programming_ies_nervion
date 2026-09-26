package ex05;
//Escribe un programa que solicite un número real y muestre su valor 
//absoluto y su raíz cuadrada utilizando métodos de la clase Math. Prueba el 
//programa con diferentes valores positivos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a real number: ");
        double number = scanner.nextDouble();

        System.out.println("Absolute value: " + Math.abs(number));
        System.out.println("Square root: " + Math.sqrt(number));

        scanner.close();
    }
}

