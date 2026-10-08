package exercise08;
//Repetir el ejercicio de los dados del boletín de SWITCH. Mientras en la 
//primera tirada no se introduzca un valor válido se le seguirá preguntando. 
//Lo mismo con la segunda tirada.
import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstRoll;
        int firstValue;

        do {
            System.out.print("First roll: ");
            firstRoll = input.nextLine().toUpperCase();

            firstValue = switch (firstRoll) {
                case "ONE" -> 1;
                case "TWO" -> 2;
                case "THREE" -> 3;
                case "FOUR" -> 4;
                case "FIVE" -> 5;
                case "SIX" -> 6;
                default -> 0;
            };
        } while (firstValue == 0);

        String secondRoll;
        int secondValue;

        do {
            System.out.print("Second roll: ");
            secondRoll = input.nextLine().toUpperCase();

            secondValue = switch (secondRoll) {
                case "ONE" -> 1;
                case "TWO" -> 2;
                case "THREE" -> 3;
                case "FOUR" -> 4;
                case "FIVE" -> 5;
                case "SIX" -> 6;
                default -> 0;
            };
        } while (secondValue == 0);

        System.out.println(firstValue + secondValue);

        input.close();
    }
}
