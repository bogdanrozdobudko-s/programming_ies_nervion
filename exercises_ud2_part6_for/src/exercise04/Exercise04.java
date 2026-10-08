package exercise04;
//Diseñar un programa que muestre la suma de los 10 primeros números impares.
public class Exercise04 {
    public static void main(String[] args) {
        int sum = 0;

        for (int number = 1; number <= 19; number += 2) {
            sum += number;
        }

        System.out.println("The sum of the first 10 odd numbers is: " + sum);
    }
}
