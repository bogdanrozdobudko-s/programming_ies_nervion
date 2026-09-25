package ex07;
//Escribir un programa que le pida al usuario su nombre, dirección y 
//teléfono. Guarda cada dato en variables distintas. A continuación, muestra 
//los datos de la siguiente forma:
//Nombre: Elena
//Dirección: Calle Inventada
//Teléfono: 987654321

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the address: ");
        String address = scanner.nextLine();

        System.out.print("Enter the phone number: ");
        String phone = scanner.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);

        scanner.close();
    }
}

