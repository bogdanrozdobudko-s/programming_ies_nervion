package exercise03;

//  El DNI consta de un entero de 8 dígitos seguido de una letra que se 
//  obtiene a partir del número de la siguiente forma:
//  letra = número DNI módulo 23

import java.util.Scanner;

public class Exercise03 {

    /*
     * Prueba 1:
     * Entrada: 12345678
     * Resultado esperado: Z
     * Resultado obtenido: Z
     *
     * Prueba 2:
     * Entrada: 00000000
     * Resultado esperado: Valor erróneo
     * Resultado obtenido: Valor erróneo
     *
     * Prueba 3:
     * Entrada: 99999999
     * Resultado esperado: R
     * Resultado obtenido: R
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce un número de DNI de 8 dígitos: ");
        int dni = input.nextInt();

        if (dni < 10000000 || dni > 99999999) {
            System.out.println("El valor introducido es erróneo.");
        } else {
            int resto = dni % 23;
            char letra;

            switch (resto) {
                case 0:
                    letra = 'T';
                    break;
                case 1:
                    letra = 'R';
                    break;
                case 2:
                    letra = 'W';
                    break;
                case 3:
                    letra = 'A';
                    break;
                case 4:
                    letra = 'G';
                    break;
                case 5:
                    letra = 'M';
                    break;
                case 6:
                    letra = 'Y';
                    break;
                case 7:
                    letra = 'F';
                    break;
                case 8:
                    letra = 'P';
                    break;
                case 9:
                    letra = 'D';
                    break;
                case 10:
                    letra = 'X';
                    break;
                case 11:
                    letra = 'B';
                    break;
                case 12:
                    letra = 'N';
                    break;
                case 13:
                    letra = 'J';
                    break;
                case 14:
                    letra = 'Z';
                    break;
                case 15:
                    letra = 'S';
                    break;
                case 16:
                    letra = 'Q';
                    break;
                case 17:
                    letra = 'V';
                    break;
                case 18:
                    letra = 'H';
                    break;
                case 19:
                    letra = 'L';
                    break;
                case 20:
                    letra = 'C';
                    break;
                case 21:
                    letra = 'K';
                    break;
                default:
                    letra = 'E';
                    break;
            }

            System.out.println("El DNI completo es: " + dni + letra);
        }

        input.close();
    }
}

