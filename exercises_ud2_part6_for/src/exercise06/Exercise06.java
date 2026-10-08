package exercise06;
//Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean hasFailingGrade = false;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter grade " + i + ": ");
            double grade = input.nextDouble();

            if (grade < 5) {
                hasFailingGrade = true;
            }
        }

        if (hasFailingGrade) {
            System.out.println("There is at least one failing grade.");
        } else {
            System.out.println("There are no failing grades.");
        }

        input.close();
    }
}
