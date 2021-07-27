package com.startjava.lesson_2.animal;

public class Wolf {
    private String sex;
    private String name;
    private float weight;
    private int age;
    private String woolColor;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8 && age <= 0) {
            System.out.println("Incorrect age!");
        } else {
            this.age = age;
        }
    }

    public String getWoolColor() {
        return woolColor;
    }

    public void setWoolColor(String woolColor) {
        this.woolColor = woolColor;
    }
    public void go() {
        System.out.println(this.name + " go");
    }

    public void seat() {
        System.out.println(this.name + " seat");
    }

    public void run() {
        System.out.println(this.name + " run");
    }

    public void cry() {
        System.out.println(this.name + " cry");
    }

    public void hunt() {
        System.out.println(this.name + " hunt");
    }
}

