package com.startjava.lesson_1.circle;

public class Cycle {
    public static void main(String[] args) {
        int i;
        for(i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        i = 6;
        while(i > -7) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();

        i = 10;
        int sum = 0;
        do {
            if(i % 2 != 0) {
                sum += i;
            }
            i++;
        } while(i < 21);
        System.out.print(sum);
    }
}
