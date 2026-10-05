package exercise04;

// Escribe un algoritmo para sumar dos tiradas de un dado de seis caras 
// que tiraría el usuario. El algoritmo pregunta al usuario cuánto ha sacado 
// en la primera tirada y el usuario le dará esa información pero en formato 
// cadena (“UNO”, “DOS” … “SEIS”).
// Después el algoritmo volverá a preguntar al usuario cuánto ha sacado en la 
// segunda tirada y el usuario también dará esa información en formato cadena.
// Por último, el algoritmo mostrará por pantalla la suma de las dos tiradas 
// en formato numérico.


import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Primera tirada: ");
        String primera = input.nextLine().toUpperCase();

        System.out.print("Segunda tirada: ");
        String segunda = input.nextLine().toUpperCase();

        int valorPrimera = switch (primera) {
            case "UNO" -> 1;
            case "DOS" -> 2;
            case "TRES" -> 3;
            case "CUATRO" -> 4;
            case "CINCO" -> 5;
            case "SEIS" -> 6;
            default -> 0;
        };

        int valorSegunda = switch (segunda) {
            case "UNO" -> 1;
            case "DOS" -> 2;
            case "TRES" -> 3;
            case "CUATRO" -> 4;
            case "CINCO" -> 5;
            case "SEIS" -> 6;
            default -> 0;
        };

        System.out.println(valorPrimera + valorSegunda);

        input.close();
    }
}
