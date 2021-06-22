public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        
        wolf1.sex = "пацан";
        wolf1.name = "Щаспою";
        wolf1.weight = 20.5f;
        wolf1.age = 12;
        wolf1.woolColor = "серый";

        wolf1.go();
        wolf1.seat();
        wolf1.run();
        wolf1.hunt();
        wolf1.cry();
    }
}