import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите первое число:");
            while (!sc.hasNextInt()) {
                System.out.println("Неккоректный ввод");
                sc.next();
            }
            int numOne = sc.nextInt();
            System.out.println("Введите знак математической операции:");
            while (!sc.hasNextLine()) {
                System.out.println("Неккоректный ввод");
                sc.next();
            }
            char sign = sc.next().charAt(0);
            System.out.println("Введите второе число:");
            while (!sc.hasNextInt()) {
                System.out.println("Неккоректный ввод");
                sc.next();
            }
            int numTwo = sc.nextInt();
            Calculator calc = new Calculator(numOne, numTwo, sign);
            System.out.println("Результат вычисления:");
            calc.calculate(numOne, numTwo, sign);
            String agreement;
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                while (!sc.hasNextLine()) {
                    System.out.println("Неккоректный ввод");
                    sc.next();
                }
                agreement = sc.nextLine();
            } while(!"yes".equals(agreement) && !"no".equals(agreement));
            if ("no".equalsIgnoreCase (agreement)) {
                break;
            } 
        }
    }
}
