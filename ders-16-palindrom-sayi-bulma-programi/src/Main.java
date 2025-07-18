import java.util.Scanner;

    // palindrom sayilar tersten okundugunda sayiyla ayni olan sayilardır.  Örnek:  132231

    public class Main {

    // isPalindrom gibi bir fonksiyon ismi palindrom mu degil mi amlami tasir o yuzden guzel bir adlandırma yapmıs olduk

    static boolean isPalindrom(int input){
        int temp,tersSayi = 0,kalan;
        temp = input;

        while (temp != 0){
            kalan = temp % 10 ;
            tersSayi = tersSayi * 10 +kalan;
            temp /= 10;
        }
        if (input == tersSayi)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println(isPalindrom(input));

        /* kodun algoritması
        121 % 10 = 1  ,  tersSayi = 1 ,  121 / 10 = 12
        12  % 10 = 2  ,  tersSayi = tersSayi * 10 + 2 = 12  ,  12 / 10 = 1
        1   % 10 = 1  ,  tersSayi = tersSayi * 10 + 1 = 11  ,  1  / 10 = 0.1 = 0   ==> temp=0
         */
    }
}