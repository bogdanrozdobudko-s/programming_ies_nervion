package ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        int century = (year + 99) / 100;
        System.out.println(century);

        scanner.close();
    }
}

