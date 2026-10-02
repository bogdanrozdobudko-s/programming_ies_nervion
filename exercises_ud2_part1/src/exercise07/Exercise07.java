package exercise07;
//Escribir un programa que simule el juego de PIEDRA, PAPEL, TIJERA, pidiendo a
//cada jugador que escriba PIEDRA, PAPEL o TIJERA. El juego debe mostrar por
//pantalla quién ha ganado el juego tras jugar una partida. Hay que contemplar
//el caso de que empaten.

import java.util.Scanner;

public class Exercise07 {
  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String player1, player2;

    while (true) {
      System.out.print("Option of the first player: ");
      player1 = input.nextLine();

      switch (player1) {
        case "rock":
        case "paper":
        case "scissors":
          break;
        default:
          System.err.println("Invalid item!");
          continue;
      }

      break;
    }

    // works only in a console supporting ANSI
    clearScreen();

    while (true) {
      System.out.print("Option of the second player: ");
      player2 = input.nextLine();

      switch (player2) {
        case "rock":
        case "paper":
        case "scissors":
          break;
        default:
          System.err.println("Invalid item!");
          continue;
      }

      break;
    }

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

    input.close();
  }
}

