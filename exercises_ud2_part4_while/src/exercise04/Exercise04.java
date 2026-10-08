package exercise04;
//Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser 
//positivos, negativos o cero). Cuando acabe de insertar los números, el 
//algoritmo debe mostrar la suma de los números positivos, la media de los 
//números negativos y el número de ceros que ha introducido el usuario.

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int positiveSum = 0;
        int negativeSum = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        while (count < 10) {
            int number = input.nextInt();

            if (number > 0) {
                positiveSum += number;
            } else if (number < 0) {
                negativeSum += number;
                negativeCount++;
            } else {
                zeroCount++;
            }

            count++;
        }

        double negativeAverage = 0;

        if (negativeCount > 0) {
            negativeAverage = (double) negativeSum / negativeCount;
        }

        System.out.println("Positive numbers sum: " + positiveSum);
        System.out.println("Negative numbers average: " + negativeAverage);
        System.out.println("Number of zeros: " + zeroCount);

        input.close();
    }
}