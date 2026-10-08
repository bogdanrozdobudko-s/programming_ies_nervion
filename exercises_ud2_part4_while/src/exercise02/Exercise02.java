package exercise02;
//Escribe un programa que vaya pidiendo al usuario números enteros positivos 
//que debe ir contando. Cuando el usuario no quiera insertar más números, 
//introducirá un número negativo y el algoritmo, antes de acabar, mostrará 
//la cantidad de números positivos introducidos por el usuario.

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int count = 0;

        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        while (number >= 0) {
            count++;
            System.out.print("Enter a positive integer: ");
            number = input.nextInt();
        }

        System.out.println("The count is " + count);
        input.close();
    }
}