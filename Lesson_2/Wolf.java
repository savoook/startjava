public class Wolf {
    public String sex;
    public String name;
    public float weight;
    public int age;
    public String woolColor;
 
    public void go() {
        System.out.println(this.name + " пошел");
    }

    public void seat() {
        System.out.println(this.name + " сел");
    }

    public void run() {
        System.out.println(this.name + " побежал");
    }

    public void cry() {
        System.out.println(this.name + " завыл");
    }

    public void hunt() {
        System.out.println(this.name + " охотится");
    }
}