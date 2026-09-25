package ex11;
//Realiza un conversor de pesetas a euros. Para ello, pídele al usuario que 
//te introduzca el valor en pesetas y, a posteriori, debes mostrarle el 
//resultado de la conversión.(1€ = 166 ptas).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value in pesetas: ");
        double pesetas = scanner.nextDouble();

        double euros = pesetas / 166;
        System.out.println("Euros: " + euros);

        scanner.close();
    }
}

