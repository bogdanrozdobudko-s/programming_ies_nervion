package ex09;
//Un depósito contiene una cantidad de litros de agua y se quiere llenar 
//botellas de una capacidad determinada. Solicita ambos valores y calcula 
//cuántas botellas completas pueden llenarse utilizando Math.floor().
//

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity of water in liters: ");
        double liters = scanner.nextDouble();

        System.out.print("Enter the bottle capacity in liters: ");
        double capacity = scanner.nextDouble();

        int bottles = (int) Math.floor(liters / capacity);

        System.out.println(bottles);

        scanner.close();
    }
}

