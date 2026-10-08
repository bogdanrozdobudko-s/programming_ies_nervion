package exercise03;
//Realiza un programa que sume los números desde el 1 hasta un número N que 
//se introducirá por teclado. Por ejemplo: Si el usuario introduce un 5, el 
//programa debe devolver la suma de 1+2+3+4+5. 

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int current = 1;
        int sum = 0;

        do {
            sum += current;
            current++;
        } while (current <= number);

        System.out.println("The sum is: " + sum);

        input.close();
    }
}
