package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int targetNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void showStat() {
        int[] stat1 = Arrays.copyOf(player1.getOptions(), player1.getCount());
        int[] stat2 = Arrays.copyOf(player2.getOptions(), player2.getCount());
        System.out.println("Попытки игрока " + player1.getName() + "  " + Arrays.toString(stat1));
        System.out.println("Попытки игрока " + player2.getName() + "  " + Arrays.toString(stat2));
        Arrays.fill(player1.getOptions(), 0, player1.getCount(), 0);
        Arrays.fill(player2.getOptions(), 0, player2.getCount(), 0);
        player1.setCount(0);
        player2.setCount(0);
    }

    public void play() {
        Random rnd = new Random();
        targetNum = rnd.nextInt(10);
        System.out.println("Компьютер загадал число! У каждого игрока 3 попытки");
        Scanner sc = new Scanner(System.in);
        Player currentPlayer = player2;

        while (true) {
            currentPlayer = currentPlayer == player1 ? player2 : player1;
            /*проверка переполненности массива*/
//            if (!Arrays.asList(currentPlayer.getOptions()).contains(String.valueOf(0))) {
            if (!IntStream.of(currentPlayer.getOptions()).anyMatch(x -> x == 0)) {
                System.out.println("У игроков закончились попытки");
                showStat();
                break;
            } else {
                int attempt;
                while (true) {
                    System.out.println(currentPlayer.getName() + ", делай свою попытку!");
                    try {
                        attempt = Integer.parseInt(sc.next());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный ввод!");
                    }
                }
                currentPlayer.setNumber(attempt);
                currentPlayer.getOptions()[currentPlayer.getCount()] = attempt;
                currentPlayer.setCount(currentPlayer.getCount() + 1);
                if (attempt > targetNum) {
                    System.out.println(currentPlayer.getName() + ", вы ввели число, которое больше того что загадал компьютер");
                } else if (attempt < targetNum) {
                    System.out.println(currentPlayer.getName() + ", вы ввели число, которое меньше того что загадал компьютер");
                } else {
                    System.out.println(currentPlayer.getName() + " угадал число " + currentPlayer.getNumber() + " с " + currentPlayer.getCount() + " попытки!");
                    showStat();
                    break;
                }
            }
        }
    }
}