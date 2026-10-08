package exercise05;


//Implementar una aplicación para calcular datos estadísticos de las edades 
//de los alumnos de un centro educativo. Se introducirán datos hasta que uno 
//de ellos sea negativo, y se mostrará: la suma de todas las edades 
//introducidas, la media, el número de alumnos y cuántos son mayores de edad.

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = 0;
        int ageSum = 0;
        int studentCount = 0;
        int adultCount = 0;

        while (age >= 0) {
            age = input.nextInt();

            if (age >= 0) {
                ageSum += age;
                studentCount++;

                if (age >= 18) {
                    adultCount++;
                }
            }
        }

        double average = 0;

        if (studentCount > 0) {
            average = (double) ageSum / studentCount;
        }

        System.out.println("Sum of ages: " + ageSum);
        System.out.println("Average age: " + average);
        System.out.println("Number of students: " + studentCount);
        System.out.println("Number of adults: " + adultCount);

        input.close();
    }
}