package exercise03;

import java.util.Scanner;

public class Exercise03
{
    public static void main(String[] args)
    {
        Scanner ask = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = ask.nextInt();
        
        for (int n = 1; n <= rows; n++)
        {
            for (int i = 1; i <= n; i++)
            {
                System.out.print("*");
            }
            
            System.out.println("");
        }
        
        ask.close();
    }
}
