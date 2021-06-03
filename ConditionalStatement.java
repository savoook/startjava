public class ConditionalStatement {
    public static void main (String[] args) {
        int age = 21;
        boolean mail = false;
        double height = 1.79;
        char firstCharName = 'M';
        if(age > 20) {
            System.out.println("Превыщение допустимого возраста");
        }
        if(mail) {
            System.out.println("Мужик!");
        }
        if(!mail) {
            System.out.println("Немужик!");
        }
        if(height < 1.80) {
            System.out.println("Хоббит");
        } else {
            System.out.println("Великан");
        }
        if(firstCharName == 'M') {
            System.out.println ("Имя начинается на " + firstCharName);
        }
        else if(firstCharName == 'I') {
            System.out.println ("Имя начинается на " + firstCharName);
        } else {
            System.out.println ("Имя не начинается на 'M' или 'I'");
        }
    }
}