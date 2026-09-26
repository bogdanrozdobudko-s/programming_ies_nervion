package ex08;
//Una empresa guarda productos en cajas con una capacidad determinada. Pide 
//al usuario el número de productos y la capacidad de cada caja. Calcula 
//cuántas cajas son necesarias para guardar todos los productos utilizando 
//Math.ceil(). El resultado final debe mostrarse como un número entero

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numberOfProducts = scanner.nextInt();

        System.out.print("Enter the capacity of each box: ");
        int boxCapacity = scanner.nextInt();

        int numberOfBoxes = (int) Math.ceil((double) numberOfProducts / boxCapacity);

        System.out.println(numberOfBoxes);

        scanner.close();
    }
}

