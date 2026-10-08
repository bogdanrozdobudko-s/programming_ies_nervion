package exercise07;
//Repetir el ejercicio de la calculadora del boletín de SWITCH de forma que 
//se añada una opción más al menú, quedando el menú así:
//SUMAR LOS NÚMEROS
//RESTAR LOS NÚMEROS
//MULTIPLICAR LOS NÚMEROS
//DIVIDIR LOS NÚMEROS
//SALIR
//De forma que se vuelva a pedir los dos números y la operación a realizar 
//hasta que se pulse la letra E para salir del programa.

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;

        do {
            System.out.println("============ CALCULADORA SIMPLE ============");
            System.out.println("SUMAR LOS NÚMEROS (+)");
            System.out.println("RESTAR LOS NÚMEROS (-)");
            System.out.println("MULTIPLICAR LOS NÚMEROS (*)");
            System.out.println("DIVIDIR LOS NÚMEROS (/)");
            System.out.println("SALIR (E)");
            System.out.println("=============================================");

            System.out.print("Introduce la operación: ");
            answer = input.nextLine().toUpperCase();

            if (!answer.equals("E")) {
                System.out.print("Introduce el primer número: ");
                float firstNumber = input.nextFloat();

                System.out.print("Introduce el segundo número: ");
                float secondNumber = input.nextFloat();

                input.nextLine();

                switch (answer) {
                    case "+":
                        System.out.println("Resultado: " + (firstNumber + secondNumber));
                        break;
                    case "-":
                        System.out.println("Resultado: " + (firstNumber - secondNumber));
                        break;
                    case "*":
                        System.out.println("Resultado: " + (firstNumber * secondNumber));
                        break;
                    case "/":
                        if (secondNumber != 0) {
                            System.out.println("Resultado: " + (firstNumber / secondNumber));
                        } else {
                            System.out.println("No se puede dividir entre cero.");
                        }
                        break;
                    default:
                        System.out.println("Operación no válida.");
                        break;
                }
            }
        } while (!answer.equals("E"));

        input.close();
    }
}