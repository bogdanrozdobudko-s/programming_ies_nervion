package ex08;
//Escribe un programa que pida al usuario su nombre y su edad y muestre por 
//pantalla un mensaje como el siguiente: “Hola Juanito, tienes 21 años, ¡qué 
//mayor eres!”. 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        System.out.println("Hola " + name + ", tienes " + age + " años, ¡qué mayor eres!");

        scanner.close();
    }
}

