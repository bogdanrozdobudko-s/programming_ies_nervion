package exercise02;
//Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un 
//número que introducimos por teclado.

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }

        System.out.println("Number of multiples of 3: " + count);

        input.close();
    }
}
