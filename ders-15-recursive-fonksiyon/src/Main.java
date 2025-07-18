import java.util.Scanner;

public class Main {

    static int recursive(int x){
        if (x == 1){
            return 1;
        }
        return x + recursive(x-1);

    }

    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();

        System.out.println(recursive(x));
    }
}