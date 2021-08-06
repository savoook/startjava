package com.startjava.lesson_2_3_4.calculator;


public class Calculator {
    private int numOne;
    private int numTwo;
    private char sign;

    public Calculator(int numOne, int numTwo, char sign) {
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.sign = sign;
    }

    public void calculate() {
        switch (sign) {
            case '+':
                System.out.println(numOne + numTwo);
                break;
            case '-':
                System.out.println(numOne - numTwo);
                break;
            case '*':
                System.out.println(numOne * numTwo);
                break;
            case '/':
                if (numTwo == 0) {
                    System.out.println("Деление на ноль");
                } else {
                    System.out.println(numOne / numTwo);
                }
                break;
            case '^':
                //System.out.println(involute(numOne, numTwo));
                System.out.println(Math.pow(numOne, numTwo));
                break;
            case '%':
                if (numTwo == 0) {
                    System.out.println("Остаток от деления на ноль, серьезно?");
                } else {
                    System.out.println(numOne % numTwo);
                }
                break;
        }
    }

    private static int involute(int a, int b) {
        int result = 1;

        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}