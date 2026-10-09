package exercise04;
//Diseñar un programa que muestre la suma de los 10 primeros números impares.
public class Exercise04 {
    public static void main(String[] args) {
        final int N = 10;
        int sum = 0;

        for (int number = 1; number <= (2 * N); number += 2) {
            if (number % 2 != 0) {
                sum += number;
            }
        }

        System.out.println("The sum of the first 10 odd numbers is: " + sum);
    }
}
