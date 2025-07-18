import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // OOP Hata Yakalama (Exeption Handling) ve Try-Catch-Finally Kullanımı

        // Örnek 1
        /*
        System.out.println("Program Başladı!");
        int a = 0;

        try {
            a = 2 / 0;      // hata yakaladık ve direkt catch içine gidiyo program
            System.out.println("Try içerisinde!");  // hata olacağı icin buradaki print kodu da calısmayacak
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println(a);

        System.out.println("Program Bitti!");
        System.out.println("-----------------------------------------------------");

        System.out.println("2. Program Başladı!");
        int[] arr = new int[3];

        try {
            arr[4] = 10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }

        System.out.println("2. Program Bitti!");
        */

        // Örnek 2 /*

        System.out.println("Program Başladı!");
        int a = 0, b;
        int[] arr = new int[3];
        Scanner scan = new Scanner(System.in);

        try {
            a = 2 / 1;
            //System.out.println(a);
            arr[4] = 10;
            b = scan.nextInt();

        }catch (ArithmeticException e){
            System.out.println("Sıfıra bölünme hatası");
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Boyut Hatası");
            System.out.println(e.getMessage());
        }catch (Exception e){       //Exception tüm hataları kapsar!
            System.out.println("Bir hata var!");
            System.out.println(e.toString());
        }finally {                  //finally kısmı catch' lerin en sonuna yazılır ve catch lerde ne olursa olsun finally kısmı calısır
            System.out.println("Finally kısmı");    // yani hata olsada hata olmasada finally kısmı calısacaktır
        }

        System.out.println("Program Bitti!");

        //  */
    }
}