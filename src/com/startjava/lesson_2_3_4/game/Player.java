package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int[] options = new int[10];
    private int count;

    public Player(String name) {
        this.name = name;
    }

    public int[] getOptions() {
        return options;
    }

    public void setOptions(int[] options) {
        this.options = options;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}