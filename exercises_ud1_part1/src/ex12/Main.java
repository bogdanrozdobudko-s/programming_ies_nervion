package ex12;
//Un frutero necesita calcular los beneficios anuales que obtiene de la 
//venta de manzanas y peras. Por este motivo, es necesario diseñar una 
//aplicación que solicite las ventas (en kilos, tanto de las peras como de 
//las manzanas). La aplicación mostrará el importe total sabiendo que el 
//precio del kilo de manzanas está fijado en 2,35€ y el kilo de peras en 
//1,95€.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the kilograms of apples: ");
        double apples = scanner.nextDouble();

        System.out.print("Enter the kilograms of pears: ");
        double pears = scanner.nextDouble();

        double total = apples * 2.35 + pears * 1.95;

        System.out.println("Total amount: " + total + "€");

        scanner.close();
    }
}

