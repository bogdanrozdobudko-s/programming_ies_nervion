package exercise05;
//Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el 
//ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo 
//números una y otra vez hasta adivinarlo (el usuario deberá indicarle al 
//ordenador si es mayor, menor o igual al número que ha pensado).
//Número pensado: 38
//numeroAleatorio(1, 100) = 83
//Escribir menor – LÍMITE MÁXIMO
//numeroAleatorio(1,82) = 15
//Escribir mayor - LÍMITE MÍNIMO
//numeroAleaotorio(16, 82) = 30
//Escribir mayor - LÍMITE MÍNIMO
//numeroAleatorio(31, 82) = 70
//Escribir menor - LÍMITE MÁXIMO
//numeroAleatorio(31, 69) = 50
//Escribir menor
//numeroAleatorio(31, 49) = 38
//Escribir iguales
//Imprimir “HAS ACERTADO”

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min = 1;
        int max = 100;
        int number;
        String response;

        System.out.print("Think of a number from 1 to 100: ");
        input.nextLine();

        do {
            number = (int) (Math.random() * (max - min + 1)) + min;

            System.out.println("numeroAleatorio(" + min + ", " + max + ") = " + number);
            System.out.print("Is your number higher, lower, or equal? (higher/lower/equal): ");
            response = input.nextLine().toLowerCase();

            if (response.equals("lower")) {
                max = number - 1;
            } else if (response.equals("higher")) {
                min = number + 1;
            } else if (response.equals("equal")) {
                System.out.println("HAS ACERTADO");
            }
        } while (!response.equals("equal"));

        input.close();
    }
}

