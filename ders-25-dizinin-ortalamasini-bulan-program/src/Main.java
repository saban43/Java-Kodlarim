import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] notlar = new int[7];
        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        System.out.println("Lütfen notlarınızı sırayla giriniz: ");
        System.out.println("Matematik: ");
        notlar[0] = scan.nextInt();
        System.out.println("Türkçe: ");
        notlar[1] = scan.nextInt();
        System.out.println("Fizik: ");
        notlar[2] = scan.nextInt();
        System.out.println("Kimya: ");
        notlar[3] = scan.nextInt();
        System.out.println("Biyoloji: ");
        notlar[4] = scan.nextInt();
        System.out.println("Tarih: ");
        notlar[5] = scan.nextInt();
        System.out.println("Cografya: ");
        notlar[6] = scan.nextInt();

        for (int not : notlar){
            toplam += not;
        }

        System.out.println("Ortalamanız: " + ( toplam / notlar.length));

    }
}