package ex15;
//Solicita tres números enteros a, b y c. Calcula y muestra el resultado de 
//las expresiones a + b * c y (a + b) * c. Comprueba que los resultados 
//pueden ser distintos y explica mediante un comentario en el código el 
//motivo.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter the third integer (c): ");
        int c = scanner.nextInt();

        int firstResult = a + b * c;
        int secondResult = (a + b) * c;

        System.out.println("a + b * c = " + firstResult);
        System.out.println("(a + b) * c = " + secondResult);

        // The results can differ because multiplication 
        // has higher precedence than addition.
        scanner.close();
    }
}
