public class MyFirstGame {
    public static void main(String[] args) {

            int comp = 1;
            int igrok = 51;

            int shag = 40;

            while(true) {
            if(igrok > comp) {
                System.out.println("Число " + igrok + " больше того, что загадал компьютер");
                igrok -= shag;
                if(shag > 1) {
                shag -= 1;
            }
                continue;

            } else if(igrok < comp) {
                System.out.println("Число " + igrok + " меньше того, что загадал компьютер");
                igrok += shag;
                if(shag > 1) {
                shag -= 1;
            }
                continue;

            } else {
                System.out.println("В точку!");
                break;
            }
        }
    }
}