package exercise01;

//  Escribe una aplicación que solicite al usuario un número comprendido entre 
//  0 y 9999. La aplicación tendrá que indicar si el número introducido es 
//  capicúa. Un número es capicúa si se lee igual de izquierda a derecha que 
//  de derecha a izquierda.
import java.util.Scanner;

public class Exercise01 {
    /*
     * Pruebas mínimas:
     * Entrada: 0
     * Resultado esperado: El número es capicúa.
     * Resultado obtenido: El número es capicúa.
     *
     * Entrada: 12321
     * Resultado esperado: El número es capicúa.
     * Resultado obtenido: El número es capicúa.
     *
     * Entrada: 1234
     * Resultado esperado: El número no es capicúa.
     * Resultado obtenido: El número no es capicúa.
     *
     * Entrada: 10000
     * Resultado esperado: El valor introducido es erróneo.
     * Resultado obtenido: El valor introducido es erróneo.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce un número entre 0 y 9999: ");
        int numero = input.nextInt();

        if (numero < 0 || numero > 9999) {
            System.out.println("El valor introducido es erróneo.");
        } else {
            int unidades = (int) Math.round((numero / 1) % 10);
            int decenas = (int) Math.round((numero / 10) % 10);
            int centenas = (int) Math.round((numero / 100) % 10);
            int millares = (int) Math.round((numero / 1000) % 10);

            if (numero < 10) {
                System.out.println("El número es capicúa.");
            } else if (numero < 100) {
                if (unidades == decenas) {
                    System.out.println("El número es capicúa.");
                } else {
                    System.out.println("El número no es capicúa.");
                }
            } else if (numero < 1000) {
                if (millares == unidades) {
                    System.out.println("El número es capicúa.");
                } else {
                    System.out.println("El número no es capicúa.");
                }
            } else {
                if (millares == unidades && centenas == decenas) {
                    System.out.println("El número es capicúa.");
                } else {
                    System.out.println("El número no es capicúa.");
                }
            }
        }

        input.close();
    }
}

