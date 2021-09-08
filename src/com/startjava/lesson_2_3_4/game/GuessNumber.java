package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int targetNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void showStat() {
        //player1.setOptions(Arrays.copyOf(player1.getOptions(), player1.getCount()));
        //player2.setOptions(Arrays.copyOf(player2.getOptions(), player2.getCount()));
        System.out.println("Попытки игрока " + player1.getName() + " ");
        for (int s : Arrays.copyOf(player1.getOptions(), player1.getCount()))
            System.out.print(s + " ");
        System.out.println();
        System.out.println("Попытки игрока " + player2.getName() + " ");
        for (int s : Arrays.copyOf(player2.getOptions(), player2.getCount()))
            System.out.print(s + " ");
        System.out.println();
        Arrays.fill(player1.getOptions(), 0, player1.getCount(), 0);
        Arrays.fill(player2.getOptions(), 0, player2.getCount(), 0);
        player1.setCount(0);
        player2.setCount(0);
    }

    public void play() {
        Random rnd = new Random();
        targetNum = rnd.nextInt(10);
        System.out.println("Компьютер загадал число! У каждого игрока 10 попыток");
        Scanner sc = new Scanner(System.in);
        Player currentPlayer = player2;

        while (true) {
            currentPlayer = currentPlayer == player1 ? player2 : player1;
            /*проверка переполненности массива*/
            //if (!Arrays.asList(currentPlayer.getOptions()).contains(String.valueOf(0))) {
            //if (!IntStream.of(currentPlayer.getOptions()).anyMatch(x -> x == 0)) {
            if ((currentPlayer.getOptions()).length == currentPlayer.getCount()) {
                System.out.println("У игроков закончились попытки");
                showStat();
                break;
            } else {
                int attempt;
                while (true) {
                    System.out.println(currentPlayer.getName() + ", делай свою попытку!");
                    try {
                        //attempt = Integer.parseInt(sc.next());
                        attempt = sc.nextInt();
                        break;
                    } catch (Exception e) {
                        //catch (NumberFormatException e)
                        System.out.println("Неверный ввод!");
                    }
                }
                currentPlayer.getOptions()[currentPlayer.getCount()] = attempt;
                currentPlayer.setCount(currentPlayer.getCount() + 1);
                if (attempt > targetNum) {
                    System.out.println(currentPlayer.getName() + ", вы ввели число, которое больше того что загадал компьютер");
                } else if (attempt < targetNum) {
                    System.out.println(currentPlayer.getName() + ", вы ввели число, которое меньше того что загадал компьютер");
                } else {
                    System.out.println(currentPlayer.getName() + " угадал число " + currentPlayer.getOptions()[currentPlayer.getCount()-1]
                            + " с " + currentPlayer.getCount() + " попытки!");
                    showStat();
                    break;
                }
            }
        }
    }
}