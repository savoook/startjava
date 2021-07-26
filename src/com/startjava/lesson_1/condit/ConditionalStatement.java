package com.startjava.lesson_1.condit;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 21;
        if(age > 20) {
            System.out.println("Превыщение допустимого возраста");
        }

        boolean male = false;
        if(male) {
            System.out.println("Мужик!");
        }
        
        if(!male) {
            System.out.println("Немужик!");
        }

        double height = 1.79;
        if(height < 1.80) {
            System.out.println("Хоббит");
        } else {
            System.out.println("Великан");
        }

        char firstCharName = 'M';
        if(firstCharName == 'M') {
            System.out.println ("Имя начинается на " + firstCharName);
        } else if(firstCharName == 'I') {
            System.out.println ("Имя начинается на " + firstCharName);
        } else {
            System.out.println ("Имя не начинается на 'M' или 'I'");
        }
    }
}