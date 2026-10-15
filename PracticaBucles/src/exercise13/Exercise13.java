package exercise13;

import java.util.Scanner;

public class Exercise13
{
    public static void main(String[] args)
    {
        Scanner ask = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = ask.nextInt();

        System.out.print("Columns: ");
        int columns = ask.nextInt();

        int mid = columns / 2;

        for (int row_num = 1; row_num <= rows; row_num++)
        {
            for (int i = 1; i <= mid; i++)
            {
                System.out.print("*");
            }

            for (int j = 1; j <= mid; j++)
            {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}
