package exercise04;
//Realiza un programa que muestre la tabla de multiplicar de un número 
//introducido por teclado. Por ejemplo, si se introduce el número 3 se debe 
//imprimir lo siguiente:
//3 x 1 = 3
//3 x 2 = 6
//3 x 3 = 9
//3 x 4 = 12
//3 x 5 = 15
//3 x 6 = 18
//3 x 7 = 21
//3 x 8 = 24
//3 x 9 = 27
//3 x 10 = 30

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int multiplier = 1;

        do {
            System.out.println(number + " x " + multiplier + " = " + (number * multiplier));
            multiplier++;
        } while (multiplier <= 10);

        input.close();
    }
}