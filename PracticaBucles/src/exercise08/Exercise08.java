package exercise08;

import java.util.Scanner;

public class Exercise08
{
    public static void main(String[] args)
    {
        Scanner ask = new Scanner(System.in);
        
        System.out.print("Enter the height of the pyramid: ");
        int height = ask.nextInt();
        
        for (int i = height; i > 1; i--)
        {
            for (int spaces = 0; spaces <= height - i; spaces++)
            {
                System.out.print(" ");
            }

            for (int j = i * 2 - 1; j > 1; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        ask.close();
    }
}
