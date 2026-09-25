package ex14;
//Escribir un programa que solicite las notas del primer, segundo y tercer 
//trimestre (notas enteras que se solicitarán al usuario). El programa debe 
//mostrar la nota media del curso como se utiliza en el boletín de 
//calificaciones (solo la parte entera) y como se usa en el expediente 
//académico (con decimales).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade for the first quarter: ");
        int first = scanner.nextInt();

        System.out.print("Enter the grade for the second quarter: ");
        int second = scanner.nextInt();

        System.out.print("Enter the grade for the third quarter: ");
        int third = scanner.nextInt();

        double average = (first + second + third) / 3.0;

        System.out.println("Report card average: " + (int) average);
        System.out.println("Academic record average: " + average);

        scanner.close();
    }
}

