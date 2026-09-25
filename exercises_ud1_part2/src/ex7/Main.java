package ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of tickets: ");
        int numberOfTickets = scanner.nextInt();

        double total = 0;

        for (int i = 1; i <= numberOfTickets; i++) {
            System.out.print("Enter the type of ticket " + i + " (child/adult): ");
            String type = scanner.next().toLowerCase();

            if (type.equals("child")) {
                total += 15.50;
            } else if (type.equals("adult")) {
                total += 20.00;
            } else {
                System.out.println("Invalid ticket type. Please enter child or adult.");
                i--;
            }
        }

        if (total >= 100) {
            total *= 0.95;
        }

        System.out.printf("Total amount to pay: %.2f€%n", total);

        scanner.close();
    }
}

