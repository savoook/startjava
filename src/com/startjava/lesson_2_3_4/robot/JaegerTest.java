package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger chernoAlpha = new Jaeger();
        chernoAlpha.setModelName("Cherno Alpha");
        chernoAlpha.setMark("Mark-1");
        chernoAlpha.setOrigin("Russia");
        chernoAlpha.setHeight(85.34f);
        chernoAlpha.setWeight(2.412f);
        chernoAlpha.setSpeed(3);
        chernoAlpha.setStrength(10);
        chernoAlpha.setArmor(10);

        Jaeger gipsyAvenger = new Jaeger("Gipsy Avenger", "Mark-6", 81.77f, 2.004f);
        gipsyAvenger.setOrigin(chernoAlpha.getOrigin());

        chernoAlpha.drift();
        gipsyAvenger.move();
    }
}