package ex14;
//Un videojuego comienza con 100 puntos y 3 vidas. Modifica estas variables 
//utilizando los operadores +=, -=, ++ y -- para representar esta secuencia: 
//gana 50 puntos, pierde 20 puntos, obtiene una vida extra y después pierde 
//una vida. Muestra el estado final.

public class Main {
    public static void main(String[] args) {
        int points = 100;
        int lives = 3;

        points += 50;
        System.out.println("Points: " + points);

        points -= 20;
        System.out.println("Points: " + points);

        lives++;
        System.out.println("Lives: " + lives);

        lives--;
        System.out.println("Lives: " + lives);

        System.out.println("Final points: " + points);
        System.out.println("Final lives: " + lives);
    }
}

