package exercise07;

import java.util.Scanner;

public class Exercise07
{
	public static void main(String[] args)
	{
		Scanner ask = new Scanner(System.in);
		
		System.out.print("Enter the height of the pyramid: ");
		int height = ask.nextInt();
		
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
		
		ask.close();
	}
}