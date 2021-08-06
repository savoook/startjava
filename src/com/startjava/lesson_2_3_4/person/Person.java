package com.startjava.lesson_2_3_4.person;

public class Person {
    String name = "Вася";
    float height = 184.7f;
    float weight = 100.5f;
    String eyes = "blue";
    int earsOfLearningJava = 2;

    void go() {
        System.out.println("Человек пошел");
    }

    void seat() {
        System.out.println("Человек сел");
    }

    int learnJava() {
        return earsOfLearningJava;
    }
}