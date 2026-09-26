package ex07;
//Utiliza la clase Random para generar y mostrar tres valores: un número 
//entero aleatorio entre 1 y 100, un número real aleatorio y un valor 
//booleano aleatorio (true o false).

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int randomInteger = random.nextInt(100) + 1;
        double randomReal = random.nextDouble();
        boolean randomBoolean = random.nextBoolean();

        System.out.println(randomInteger);
        System.out.println(randomReal);
        System.out.println(randomBoolean);
    }
}

