package exercise08;
//Realiza un programa que pida dos números enteros A y B. Luego visualiza 
//los números que hay entre A y B. Si A es menor que B, entonces debe 
//mostrar los números desde A hasta B. Si B es menor que A, entonces debe 
//mostrar los números desde B hasta A.

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer A: ");
        int a = input.nextInt();

        System.out.print("Enter integer B: ");
        int b = input.nextInt();

        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = b; i <= a; i++) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
