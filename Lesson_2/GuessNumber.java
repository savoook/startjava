import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int targetNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Random rnd = new Random();
        targetNum = rnd.nextInt(10);
        System.out.println("Компьютер загадал число!");
        Scanner sc = new Scanner(System.in);
        Player currentPlayer = player2;
        while (true) {
            currentPlayer = currentPlayer == player1 ? player2 : player1;
            System.out.println(currentPlayer.getName() + ", делай свою попытку!");
            int attempt = sc.nextInt();
            currentPlayer.setNumber(attempt);
            if (attempt > targetNum) {
                System.out.println(currentPlayer.getName() + ", вы ввели число, которое больше того что загадал компьютер");
            } else if(attempt < targetNum) {
                System.out.println(currentPlayer.getName() + ", вы ввели число, которое меньше того что загадал компьютер");
            } else {
                System.out.println(currentPlayer.getName() + ", в точку!");
                break;
            }
        }
    }
}