import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String agreement = "yes";
        Scanner sc = new Scanner(System.in);
        while ("yes".equals(agreement)) {
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
            calc.calculate();
           
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                while (!sc.hasNextLine()) {
                    System.out.println("Неккоректный ввод");
                    sc.next();
                }
                agreement = sc.nextLine();
            } while(!"yes".equals(agreement) && !"no".equals(agreement));
        } 
    }
}

