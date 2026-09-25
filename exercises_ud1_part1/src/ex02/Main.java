package ex02;

import java.util.Scanner;
//Pedir al usuario su edad y mostrar la edad que tendrá el próximo año.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Next year, you will be " + (age + 1) + " years old.");

        scanner.close();
    }
}
