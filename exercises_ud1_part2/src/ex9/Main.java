package ex9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int problem = scanner.nextInt();
        int volume = (problem - 100) / 100 + 1;

        System.out.println(volume);

        scanner.close();
    }
}

