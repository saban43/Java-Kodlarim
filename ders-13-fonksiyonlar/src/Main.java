
public class Main {
    public static void main(String[] args) {

        f(0);
        sum(29,11);

    }

    static void f(int x){
        int result = (x*x)+(5*x)+21;
        System.out.println(result);
    }

    static void sum(int number1,int number2){
        int result = number1 + number2;
        System.out.println(result);
    }

}
