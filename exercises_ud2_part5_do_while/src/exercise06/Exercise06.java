package exercise06;
//Repetir el juego de PIEDRA - PAPEL - TIJERA pero con las siguientes 
//consideraciones:
//Al jugador 1 se le pedirá que introduzca una opción válida: PIEDRA, PAPEL 
//o TIJERA. Mientras no introduzca un valor válido se le seguirá preguntando.
//Al jugador 2 se le pedirá que introduzca una opción válida: PIEDRA, PAPEL 
//o TIJERA. Mientras no introduzca un valor válido se le seguirá preguntando.
//Al terminar una partida se preguntará si se quiere seguir jugando. 
//Mientras se pulse “S” se volverá a iniciar la partida.

import java.util.Scanner;

public class Exercise06 {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String player1;
        String player2;
        String continueGame;

        do {
            do {
                System.out.print("Option of the first player: ");
                player1 = input.nextLine();

                if (!player1.equals("rock") && !player1.equals("paper") && !player1.equals("scissors")) {
                    System.err.println("Invalid item!");
                }
            } while (!player1.equals("rock") && !player1.equals("paper") && !player1.equals("scissors"));

            clearScreen();

            do {
                System.out.print("Option of the second player: ");
                player2 = input.nextLine();

                if (!player2.equals("rock") && !player2.equals("paper") && !player2.equals("scissors")) {
                    System.err.println("Invalid item!");
                }
            } while (!player2.equals("rock") && !player2.equals("paper") && !player2.equals("scissors"));

            if (player1.equals(player2)) {
                System.out.println("Draw!");
            } else if (
                (player1.equals("rock") && player2.equals("scissors")) ||
                (player1.equals("paper") && player2.equals("rock")) ||
                (player1.equals("scissors") && player2.equals("paper"))
            ) {
                System.out.println("Player 1 wins!");
            } else {
                System.out.println("Player 2 wins!");
            }

            System.out.print("Do you want to continue playing? (S/N): ");
            continueGame = input.nextLine();

        } while (continueGame.equals("S"));

        input.close();
    }
}
