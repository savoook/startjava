import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Начало игры. Игрок 1 введи свое имя!");
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        Player player1 = new Player(name1);
        System.out.println("Игрок 2 введи свое имя!");
        String name2 = sc.nextLine();
        Player player2 = new Player(name2);
        while (true) {
        GuessNumber game = new GuessNumber(player1, player2);
        game.gaming();
        System.out.println("Хотите продолжить вычисления? [yes/no]:");
        String agreement;
        do {
            while(!sc.hasNextLine()) {
                System.out.println("Неккоректный ввод");
                sc.next();
            }
            agreement = sc.nextLine();
            } while(!agreement.equals("yes") && !agreement.equals("no"));
            if (agreement.equals("no")) {
                break;
            }
            continue;
        }
    }
}
