package exercise01;
//Escribir una aplicación para aprender a contar, que pedirá un número n y 
//mostrará todos los números del 1 al n.

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        input.close();
    }
}
