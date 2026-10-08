package exercise03;


//Escribe un programa que vaya pidiendo al usuario números enteros positivos 
//que debe ir sumando. Cuando el usuario no quiera insertar más números, 
//introducirá un número negativo y el algoritmo, antes de acabar, mostrará 
//la media de los números positivos introducidos por el usuario.
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;

        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        while (number >= 0) {
            sum += number;
            count++;
            System.out.print("Enter a positive integer: ");
            number = input.nextInt();
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The average is " + average);
        } else {
            System.out.println("No positive numbers were entered.");
        }

        input.close();
    }
}
