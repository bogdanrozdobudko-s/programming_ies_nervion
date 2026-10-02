package exercise03;

import java.util.Scanner;

// Escribir un programa que pida al usuario un mes y un año 
// y que muestre por pantalla el número total de días que 
// tiene ese mes de ese año. Hay que considerar que los meses
// de febrero pueden tener 29 o 28 días según el año sea o no bisiesto.


public class Exercise03 {
  public static boolean checkYear(int num) {
    if (num % 4 == 0) {
      if (num % 100 == 0) {
        return num % 400 == 0;
      }
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int month, year, days;
    Boolean isLeapYear;
    
    System.out.print("Enter the number of a month: ");
    month = input.nextInt();
    
    System.out.print("Enter the number of a year: ");
    year = input.nextInt();
    
    days = 0;
    
    isLeapYear = checkYear(year);
    
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) {
      days = 31;
    } else if ( month == 4 || month == 6 || month == 9 || month == 11 ) {
      days = 30;
    } else if ( month == 2 && isLeapYear) {
      days = 29;
    } else if ( month == 2 && !isLeapYear) {
      days = 28;
    } else {
      System.out.println("Invalid month");
      System.exit(1);
    }
    
    
    System.out.println("\n" + days + " days in this month.");
    input.close();
  }
}
