package ex05;
//Diseñar una aplicación que calcule la longitud y el área de una 
//circunferencia. Para ello, el usuario debe introducir el radio, que puede 
//contener decimales. Usa Math.PI para tomar el valor de PI. (longitud = 
//2πr, área=πr2)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double length = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("The length of the circle is: " + length);
        System.out.println("The area of the circle is: " + area);

        scanner.close();
    }
}

