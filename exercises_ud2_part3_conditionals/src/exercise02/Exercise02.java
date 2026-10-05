package exercise02;

//  Utiliza un operador ternario para calcular el valor absoluto de un número 
//  que se solicita al usuario por teclado.


/*
Pruebas mínimas:
1. Entrada: -8
   Resultado esperado: 8
   Resultado obtenido: 8

2. Entrada: 5
   Resultado esperado: 5
   Resultado obtenido: 5

3. Entrada: 0
   Resultado esperado: 0
   Resultado obtenido: 0
*/

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double numero = input.nextDouble();

        double valorAbsoluto = numero < 0 ? -numero : numero;

        System.out.println("El valor absoluto es: " + valorAbsoluto);

        input.close();
    }
}

