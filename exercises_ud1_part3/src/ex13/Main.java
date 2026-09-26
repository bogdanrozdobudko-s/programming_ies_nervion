package ex13;
//Pide al usuario una cantidad de dinero con decimales. Mediante un cast a 
//int obtén la cantidad de euros enteros. A partir de la parte decimal, 
//calcula también los céntimos y redondéalos correctamente.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of money: ");
        double amount = scanner.nextDouble();

        int euros = (int) amount;
        int cents = (int) Math.round((amount - euros) * 100);

        if (cents == 100) {
            euros++;
            cents = 0;
        }

        System.out.println("Euros: " + euros);
        System.out.println("Cents: " + cents);

        scanner.close();
    }
}

