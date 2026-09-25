package ex13;
//Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen 
//aspectos que influirán en esta decisión: solo podremos salir a la calle si 
//no está lloviendo y hemos finalizado nuestras tareas. 
//Existe una opción en la que, indistintamente de lo anterior, podremos 
//salir a la calle: el hecho de tener que ir a la biblioteca.
//Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado 
//las tareas y si necesita ir a la biblioteca.
//El algoritmo debe mostrar mediante un booleano (true o false) si es 
//posible que se le otorgue permiso para salir a la calle.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Is it raining? (true/false): ");
        boolean raining = scanner.nextBoolean();

        System.out.print("Have you completed your tasks? (true/false): ");
        boolean tasksCompleted = scanner.nextBoolean();

        System.out.print("Do you need to go to the library? (true/false): ");
        boolean library = scanner.nextBoolean();

        boolean canGoOut = (!raining && tasksCompleted) || library;

        System.out.println(canGoOut);

        scanner.close();
    }
}

