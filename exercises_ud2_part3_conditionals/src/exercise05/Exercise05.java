package exercise05;

//  Determinar el precio de un billete de tren, conociendo la distancia a 
//  recorrer, y sabiendo que si el número de días de estancia es superior a 7 
//  y la distancia superior a 800 km el billete tiene una reducción del 30%. 
//  El precio por kilómetro es de 2,5€. La distancia a recorrer y el número de 
//  días de estancia los debes solicitar al usuario por teclado.
import java.util.Scanner;

public class Exercise05 {
    /*
     Prueba 1: entrada = distancia 1000 km, estancia 8 días; resultado esperado = 1750.00 €; resultado obtenido = 1750.00 €.
     Prueba 2: entrada = distancia 800 km, estancia 8 días; resultado esperado = 2000.00 €; resultado obtenido = 2000.00 €.
     Prueba 3: entrada = distancia 900 km, estancia 7 días; resultado esperado = 2250.00 €; resultado obtenido = 2250.00 €.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distancia;
        int diasEstancia;
        double precio;

        System.out.print("Introduce la distancia a recorrer en km: ");
        distancia = input.nextDouble();

        if (distancia <= 0) {
            System.out.println("La distancia introducida es errónea.");
            input.close();
            return;
        }

        System.out.print("Introduce el número de días de estancia: ");
        diasEstancia = input.nextInt();

        if (diasEstancia <= 0) {
            System.out.println("El número de días introducido es erróneo.");
            input.close();
            return;
        }

        precio = distancia * 2.5;

        if (diasEstancia > 7 && distancia > 800) {
            precio *= 0.70;
        }

        System.out.printf("El precio del billete es: %.2f €%n", precio);

        input.close();
    }
}

