package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Начало игры. Игрок 1 введи свое имя!");
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        Player player1 = new Player(name1);

        System.out.println("Игрок 2 введи свое имя!");
        String name2 = sc.nextLine();
        Player player2 = new Player(name2);
        String agreement = "yes";

        while (agreement.equals("yes")) {
            GuessNumber game = new GuessNumber(player1, player2);
            game.play();
            System.out.println("Хотите продолжить игру? [yes/no]:");
            int count = 0;
            do {
                if (count > 0)
                    System.out.println("Некорректный ввод");
                agreement = sc.nextLine();
                count++;
            } while (!agreement.equals("yes") && !agreement.equals("no"));
        }
    }
}
