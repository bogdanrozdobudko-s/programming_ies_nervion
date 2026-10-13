package exercise04;

import java.util.Scanner;

public class Exercise04
{
    public static void main(String[] args)
    {
        Scanner ask = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = ask.nextInt();
        
        for (int n = rows; n >= 1; n--)
        {
            for (int i = n; i >= 1; i--)
            {
                System.out.print("*");
            }
            
            System.out.println("");
        }
        
        ask.close();
    }
}