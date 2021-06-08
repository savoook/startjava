public class MyFirstGame {
    public static void main(String[] args) {
        int mysteryNum = 1;
        int attempt = 51;
        int step = 40;
        
        while(true) {
            if(attempt > mysteryNum) {
                System.out.println("Число " + attempt + " больше того, что загадал компьютер");
                attempt -= step;
                if(step > 1) {
                    step -= 1;
                }
                continue;
            } else if(attempt < mysteryNum) {
                System.out.println("Число " + attempt + " меньше того, что загадал компьютер");
                attempt += step;
                if(step > 1) {
                    step -= 1;
                }
                continue;
            } else {
                System.out.println("В точку!");
                break;
            }
        }   
    }
}