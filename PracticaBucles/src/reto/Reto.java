package reto;

import java.util.Scanner;

public class Reto
{
    public static boolean isPositive(int number)
    {
        return number > 0;
    }

    public static void main(String[] args)
    {
        Scanner ask = new Scanner(System.in);
        int option;

        do
        {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Hourglass");
            System.out.println("2. Figure with two diagonals");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            option = ask.nextInt();

            switch (option)
            {
                case 1:
                {
                    int height;

                    do
                    {
                        System.out.print("Enter the height of the hourglass: ");
                        height = ask.nextInt();

                        if (!isPositive(height))
                        {
                            System.out.println("The height must be positive.");
                        }
                    }
                    while (!isPositive(height));

                    for (int i = height - 2; i >= 1; i--)
                    {
                        for (int j = 1; j <= height - i - 1; j++)
                        {
                            System.out.print(" ");
                        }

                        for (int j = i; j >= 0; j--)
                        {
                            System.out.print("* ");
                        }

                        System.out.println();
                    }

                    for (int i = 0; i < height; i++)
                    {
                        for (int j = height - i; j > 1; j--)
                        {
                            System.out.print(" ");
                        }

                        for (int j = 0; j <= i; j++)
                        {
                            System.out.print("* ");
                        }

                        System.out.println();
                    }

                    break;
                }

                case 2:
                {
                    int rows;

                    do
                    {
                        System.out.print("Rows: ");
                        rows = ask.nextInt();

                        if (!isPositive(rows))
                        {
                            System.out.println("The number of rows must be positive.");
                        }
                    }
                    while (!isPositive(rows));

                    for (int num_row = 1; num_row <= rows; num_row++)
                    {
                        for (int i = 1; i <= rows; i++)
                        {
                            if (i == num_row || i == rows - num_row + 1)
                            {
                                System.out.print("#");
                            }
                            else
                            {
                                System.out.print(".");
                            }
                        }

                        System.out.println();
                    }

                    break;
                }

                case 3:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Choose 1, 2 or 3.");
            }
        }
        while (option != 3);

        ask.close();
    }
}
