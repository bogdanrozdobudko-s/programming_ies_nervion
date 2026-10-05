package exercise06;

//  Pedir al usuario el número de un mes y el año (comprobando si es o no 
//  bisiesto). Debe imprimir por pantalla el número de días que tiene el mes.

import java.util.Scanner;

// Pruebas mínimas:
// Entrada: mes = 2, año = 2024 | Esperado: 29 días | Obtenido: 29 días
// Entrada: mes = 2, año = 2023 | Esperado: 28 días | Obtenido: 28 días
// Entrada: mes = 4, año = 2025 | Esperado: 30 días | Obtenido: 30 días
// Entrada: mes = 13, año = 2025 | Esperado: "Mes erróneo" | Obtenido: "Mes erróneo"
public class Exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el número del mes (1-12): ");
        int mes = input.nextInt();

        System.out.print("Introduce el año: ");
        int año = input.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("El valor introducido para el mes es erróneo.");
        } else {
            int dias;

            switch (mes) {
                case 2:
                    if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
                        dias = 29;
                    } else {
                        dias = 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    dias = 30;
                    break;
                default:
                    dias = 31;
            }

            System.out.println("El mes tiene " + dias + " días.");
        }

        input.close();
    }
}

