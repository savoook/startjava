package com.startjava.lesson_2.game;

import com.startjava.lesson_2.game.Player;
import com.startjava.lesson_2.game.GuessNumber;
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
        String agreement="yes";
        while (agreement.equals("yes")) {
            GuessNumber game = new GuessNumber(player1, player2);
            game.play();
            System.out.println("Хотите продолжить игру? [yes/no]:");
            do {
                while(!sc.hasNextLine()) {
                    System.out.println("Неккоректный ввод");
                    sc.next();
                }
                agreement = sc.nextLine();
            } while(!agreement.equals("yes") && !agreement.equals("no"));
        }
    }   
}
