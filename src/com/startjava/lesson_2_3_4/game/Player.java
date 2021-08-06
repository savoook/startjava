package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] options = {0, 0, 0};
    private int count = 0;

    public Player(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", options=" + Arrays.toString(options) +
                ", count=" + count +
                '}';
    }
}