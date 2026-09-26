package ex11;
//Diseña un programa que determine si una persona puede alquilar un 
//vehículo. Solicita su edad y dos valores booleanos que indiquen si posee 
//permiso de conducir y si tiene una sanción que le impida conducir. Podrá 
//alquilarlo si es mayor de edad, tiene permiso y no tiene dicha sanción. 
//Muestra únicamente el resultado booleano.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        System.out.print("Enter whether you have a driver's license (true/false): ");
        boolean hasLicense = scanner.nextBoolean();

        System.out.print("Enter whether you have a driving sanction (true/false): ");
        boolean hasSanction = scanner.nextBoolean();

        boolean canRent = age >= 18 && hasLicense && !hasSanction;

        System.out.println(canRent);

        scanner.close();
    }
}

