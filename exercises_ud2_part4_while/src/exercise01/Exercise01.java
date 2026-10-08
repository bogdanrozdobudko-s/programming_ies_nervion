package exercise01;
//Escribe un programa que vaya pidiendo al usuario números enteros positivos 
//que debe ir sumando. Cuando el usuario no quiera insertar más números, 
//introducirá un número negativo y el algoritmo, antes de acabar, mostrará 
//la suma de los números positivos introducidos por el usuario.
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;

        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        while (number >= 0) {
            sum += number;
            System.out.print("Enter a positive integer: ");
            number = input.nextInt();
        }

        System.out.println("The sum is " + sum);
        input.close();
    }
}