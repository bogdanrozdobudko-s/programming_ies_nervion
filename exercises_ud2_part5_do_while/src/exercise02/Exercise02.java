package exercise02;
//Realiza un programa que muestre los números pares comprendidos entre el 1 
//y el 200.
public class Exercise02 {
    public static void main(String[] args) {
        int number = 2;

        do {
            System.out.println(number);
            number += 2;
        } while (number <= 200);
    }
}