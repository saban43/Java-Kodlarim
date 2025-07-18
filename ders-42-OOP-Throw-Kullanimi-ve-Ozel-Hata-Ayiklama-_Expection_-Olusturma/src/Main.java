
public class Main {
    public static void main(String[] args) {
        int a = 0;
        if(a == 0){
            System.out.println("Bölen sıfıra eşit olamaz!");
            throw new ArithmeticException("Exception !");
        }

        System.out.println("Kodun devamı");
    }
}