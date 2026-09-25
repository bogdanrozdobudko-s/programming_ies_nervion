package ex15;
//Escribe un programa en el que declares una constante IVA de valor igual a 
//21. A continuación, pídele un precio al usuario (recuerda que los precios 
//contienen decimales) y calcula cuál será el precio final con el IVA 
//aplicado.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double IVA = 21.0;

        System.out.print("Enter the price: ");
        double price = scanner.nextDouble();

        double finalPrice = price + (price * IVA / 100);

        System.out.println("Final price with IVA: " + finalPrice);

        scanner.close();
    }
}

