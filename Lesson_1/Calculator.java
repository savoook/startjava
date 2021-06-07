public class Calculator() {
    public class vozxedenieVStepen(int a, int b) {
        int result = 1;
    for (int i; i <= b; i++){
        result = result * a
        }
        return result
    }
    public static void main(String[] args) {

        int chislo1 = 2;
        int chislo2 = 3;
        char znak = '+';

        if(char=='+') {
            System.out.println(chislo1+chislo2);

        } else if(char=='-') {
            System.out.println(chislo1-chislo2);

        } else if(char=='*') {
            System.out.println(chislo1*chislo2);

        } else if(char=='/') {
            System.out.println(chislo1/chislo2);

        } else if(char=='^') {  
            System.out.println(vozxedenieVStepen(chislo1, chislo2));

        } else if(char=='%') {
            System.out.println(chislo1%chislo2);

        }
    }
}