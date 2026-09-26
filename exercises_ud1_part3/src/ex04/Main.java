package ex04;
//Pide al usuario un número real y muestra: el entero inmediatamente 

//inferior mediante Math.floor(), el entero inmediatamente superior mediante 
//Math.ceil() y el entero más cercano mediante Math.round().

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a real number: ");
		double number = scanner.nextDouble();

		System.out.println("Immediately inferior integer: " + Math.floor(number));
		System.out.println("Immediately superior integer: " + Math.ceil(number));
		System.out.println("Nearest integer: " + Math.round(number));

		scanner.close();
	}
}
