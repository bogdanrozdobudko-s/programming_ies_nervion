import java.util.Scanner;
public class Box
{
    public static void main(String[] args)
    {
        Scanner ask = new Scanner(System.in);

        System.out.print("Box size: ");
        int rows = ask.nextInt();

        for (int i = 1; i < rows; i++)
        {
            for (int j = 1; j < rows; j++)
            {
                if (i == 1 || i == rows - 1 || j == i || j == rows - 1 || i + j == rows - 1 || j == 1)
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        ask.close();
    }
}
