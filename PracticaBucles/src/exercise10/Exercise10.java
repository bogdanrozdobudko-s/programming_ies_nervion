package exercise10;

import java.util.Scanner;

public class Exercise10
{
    public static boolean isEven(int num)
    {
        if (num % 2 == 0)
	{
	    return true;
	} else
	{
	    return false;
	}
    }

    public static void main(String[] args)
    {
        Scanner ask = new Scanner(System.in);
        System.out.print("Number of rows: ");
        int rows = ask.nextInt();

        System.out.print("Number of columns: ");
	int columns = ask.nextInt();

	for (int i = 1; i <= rows; i++)
	{
	    for (int j = 1; j <= columns; j++)
	    {
	        if (isEven(i))
		{
		    System.out.print("#");
		} else
		{
		    System.out.print("*");
		}
	    }
	    System.out.println();
	}
    }
}
