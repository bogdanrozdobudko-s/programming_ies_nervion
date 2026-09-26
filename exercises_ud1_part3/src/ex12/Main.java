package ex12;
//Pide al usuario su edad y utiliza el operador ternario para calcular el 
//precio de una entrada: 6,50 € si es menor de 18 años y 9,50 € en caso 
//contrario. Muestra el precio correspondiente.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        double ticketPrice = age < 18 ? 6.50 : 9.50;

        System.out.println(ticketPrice + " €");

        scanner.close();
    }
}

