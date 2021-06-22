public class Person {
    public String name = "Вася"
    public float height = 184.7f;
    public float weight = 100.5f;
    public String eyes = "blue";
    public int earsOfLearningJava = 2;

    public void go() {
        System.out.println("Человек пошел");
    }

    public void seat() {
        System.out.println("Человек сел");
    }

    public int learnJava() {
        return earsOfLearningJava;
    }
}