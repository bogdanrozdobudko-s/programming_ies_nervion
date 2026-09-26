package ex01;
//Escribe un programa que solicite al usuario la base y la altura de un 
//rectángulo (pueden contener decimales). Debe calcular y mostrar su 
//perímetro y su área.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        double perimeter = 2 * (base + height);
        double area = base * height;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);

        scanner.close();
    }
}

