package exercise15;

import java.util.Scanner;

public class Exercise15
{
    public static void main(String[] args)
    {
        Scanner ask = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = ask.nextInt();

        for (int num_row = 1; num_row <= rows; num_row++)
        {
            for (int i = 1; i <= rows; i++)
            {
                if (i == num_row)
                {
                    System.out.print("#");
                } else
                {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        ask.close();
    }
}
