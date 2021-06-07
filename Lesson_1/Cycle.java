/*Выведите на консоль с помощью цикла for все числа от [0, 20]
Выведите на консоль с помощью цикла while все числа от [6, -6] (с шагом итерации 2)
Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20]. Выведите ее на консоль*/
public class Cycle {
    public static void main(String[] args) {
        int i;
        for(i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        i = 6;
        while(i > -7) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();

        i = 10;
        int sum = 0;
        do {
            if(i % 2 != 0) {
                sum += i;
            }
            i++;
        } while(i < 21);
        System.out.print(sum);
    }
}
