package exercise01;
//Realiza un programa que muestre por pantalla los 20 primeros números 
//naturales (1, 2, 3... 20).

public class Exercise01 {
    public static void main(String[] args) {
        int number = 1;

        do {
            System.out.println(number);
            number++;
        } while (number <= 20);
    }
}
