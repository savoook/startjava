package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 10;
        char sign = '^';

        if(sign == '+') {
            System.out.println(num1 + num2);
        } else if(sign == '-') {
            System.out.println(num1 - num2);
        } else if(sign == '*') {
            System.out.println(num1 * num2);
        } else if(sign == '/') {
            if (num2 == 0) {
                System.out.println("Деление на ноль");
            } else {
                System.out.println(num1 / num2);
            }
        } else if(sign == '^') {  
            System.out.println(involute(num1, num2));
        } else if(sign == '%') {
            if (num2 == 0) {
                System.out.println("Остаток от деления на ноль, серьезно?");
            } else {
                System.out.println(num1 % num2);
            }
        }
    }

    private static int involute(int a, int b) {
         int result = 1;
        /*if(b == 0) {
            return result;
        }*/
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}