import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int compNumber;

    public GuessNumber() {
    }

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void gaming() {
    Random rd = new Random();
    compNumber = rd.nextInt(10);
    System.out.println("Компьютер загадал число!");
    int count = 1;
    while (true) {
        Player player = count % 2 == 0 ?  player2 :player1;
        System.out.println(player.getName() + " ,делай свою попытку!");
        Scanner sc = new Scanner(System.in);
        int attempt = sc.nextInt();
        player.setNumber(attempt);
        count+=1;
        if (attempt > compNumber) {
            System.out.println(player.getName() + " ,вы ввели число, которое больше того что загадал компьютер");
        } else if(attempt < compNumber) {
            System.out.println(player.getName() + " ,вы ввели число, которое меньше того что загадал компьютер");
        } else {
            System.out.println(player.getName() + " ,в точку!");
            break;
        }
    }
}
}