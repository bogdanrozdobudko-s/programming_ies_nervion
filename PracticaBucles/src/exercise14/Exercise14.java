package exercise14;

import java.util.Scanner;

public class Exercise14
{
    public static void main(String[] args)
    {
        Scanner ask = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = ask.nextInt();

        System.out.print("Columns: ");
        int columns = ask.nextInt();

        int mid = rows / 2;

        for (int row_num = 1; row_num <= mid; row_num++)
        {
            for (int i = 1; i <= columns; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row_num = 1; row_num <= mid; row_num++)
        {
            for (int i = 1; i <= columns; i++)
            {
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
