package exercise06;

//Un centro de investigación de la flora urbana necesita una aplicación que 
//muestre cuál es el árbol más alto. Para ello se introducirá por teclado la 
//altura (en centímetros) de cada árbol (terminando la introducción de datos 
//cuando se utilice -1 como altura). La aplicación debe devolver la altura 
//del árbol más alto.

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double height = 0;
        double maximumHeight = 0;

        while (height != -1) {
            height = input.nextDouble();

            if (height != -1 && height > maximumHeight) {
                maximumHeight = height;
            }
        }

        System.out.println("Maximum tree height: " + maximumHeight);

        input.close();
    }
}
