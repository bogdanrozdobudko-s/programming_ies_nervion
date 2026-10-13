package exercise02;

// Dibuja solo el contorno. Las posiciones interiores son espacios.
// Ejemplo de entrada: 4 filas, 7 columnas

import java.util.Scanner;

public class Exercise02
{
    public static void main(String[] args)
    {
        Scanner ask = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = ask.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = ask.nextInt();

        for (int j = 1; j <= rows; j++)
        {
            for (int i = 1; i <= columns; i++)
            {
                if (j == 1 || j == rows || i == 1 || i == columns)
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }

        ask.close();
    }
}
