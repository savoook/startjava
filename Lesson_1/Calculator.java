public class Calculator {
    public static int exponentiation(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 5;
        char sign = '%';

        if(sign=='+') {
            System.out.println(num1+num2);
        } else if(sign=='-') {
            System.out.println(num1-num2);
        } else if(sign=='*') {
            System.out.println(num1*num2);
        } else if(sign=='/') {
            System.out.println(num1/num2);
        } else if(sign=='^') {  
            System.out.println(exponentiation(num1, num2));
        } else if(sign=='%') {
            System.out.println(num1%num2);
        }
    }
}