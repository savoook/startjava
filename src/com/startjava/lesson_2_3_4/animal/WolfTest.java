package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        
        wolf1.setSex("male");
        wolf1.setName("Dude");
        wolf1.setWeight(20.5f);
        wolf1.setAge(12);
        wolf1.setWoolColor("grey");

        System.out.println("Wolf parametres: sex - " + wolf1.getSex() + ", name - " + 
                wolf1.getName() + ", weight - " + wolf1.getWeight() + ", age - " + wolf1.getAge() + ", woolcolor - " + wolf1.getWoolColor());

        wolf1.go();
        wolf1.seat();
        wolf1.run();
        wolf1.hunt();
        wolf1.cry();
    }
}