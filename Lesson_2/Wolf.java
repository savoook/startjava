public class Wolf {
    String sex;
    String name;
    float weight;
    int age;
    String woolColor;
 
    void go() {
        System.out.println(this.name + " пошел");
    }

    void seat() {
        System.out.println(this.name + " сел");
    }

    void run() {
        System.out.println(this.name + " побежал");
    }

    void cry() {
        System.out.println(this.name + " завыл");
    }

    void hunt() {
        System.out.println(this.name + " охотится");
    }
}