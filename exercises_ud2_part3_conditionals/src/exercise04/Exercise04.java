package exercise04;

// Realiza el “juego de la suma”, que consiste 
// en que aparezcan dos números aleatorios (comprendidos entre 1 y 99) 
// y el usuario tiene que sumarlos. La aplicación le pedirá al usuario 
// que introduzca el resultado de la suma. La aplicación le indicará si 
// el resultado es correcto o no.

import java.util.Scanner;

public class Exercise04 {
    /*
     * Pruebas mínimas:
     * Entrada: 5 + 7 = 12 | Resultado esperado: "Resultado correcto." | Resultado obtenido: "Resultado correcto."
     * Entrada: 5 + 7 = 10 | Resultado esperado: "Resultado incorrecto." | Resultado obtenido: "Resultado incorrecto."
     * Entrada: -1 | Resultado esperado: "El valor introducido es erróneo." | Resultado obtenido: "El valor introducido es erróneo."
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1 = (int) (Math.random() * 99) + 1;
        int numero2 = (int) (Math.random() * 99) + 1;
        int resultadoCorrecto = numero1 + numero2;

        System.out.println("¿Cuánto es " + numero1 + " + " + numero2 + "?");
        int resultado = input.nextInt();

        if (resultado < 2 || resultado > 198) {
            System.out.println("El valor introducido es erróneo.");
        } else if (resultado == resultadoCorrecto) {
            System.out.println("Resultado correcto.");
        } else {
            System.out.println("Resultado incorrecto.");
        }

        input.close();
    }
}

