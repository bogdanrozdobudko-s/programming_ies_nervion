package exercise06;

import java.util.Scanner;

public class Exercise06
{
    public static void main(String[] args)
    {
        Scanner ask = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = ask.nextInt();

        
        for (int n = 1; n <= rows; n++)
        {
            int spaces = n;
            int stars = rows - n;
            
            for (int i = 1; i <= spaces; i++)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++)
            {
                System.out.print("*");
            }

            System.out.println("");
        }
        
        ask.close();
    }
}
