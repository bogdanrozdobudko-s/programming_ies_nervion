package ex03;
//Una tienda aplica un descuento fijo del 15% y, posteriormente, un IVA del 
//21%. Declara ambos porcentajes como constantes. Pide el precio inicial al 
//usuario, calcula el precio final y muéstralo redondeado a dos cifras 
//decimales utilizando Math.round().

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double DISCOUNT = 0.15;
        final double VAT = 0.21;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial price: ");
        double initialPrice = scanner.nextDouble();

        double discountedPrice = initialPrice * (1 - DISCOUNT);
        double finalPrice = discountedPrice * (1 + VAT);
        double roundedPrice = Math.round(finalPrice * 100.0) / 100.0;

        System.out.println("Final price: " + roundedPrice);

        scanner.close();
    }
}
