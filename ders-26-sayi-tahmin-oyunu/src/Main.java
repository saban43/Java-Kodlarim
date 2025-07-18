import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int tahmin, can = 10  ,i=0 ;
        boolean oyunDurumu = false   , hata =false ;
        int[] tahminler = new int[10];


        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int sayi = rand.nextInt(100);      // 0 ile 100 arasında rastgele bir sayi üretir

        System.out.println("Bir sayı tuttum bil bakalım");

        while (can > 0){
            System.out.print("tahminin: ");
            tahmin = scan.nextInt();

            if( (tahmin < 0 ) || (tahmin > 99)){
                if (hata) {
                    System.out.println("Cok fazla hatalı giris yaptın! 1 can kaybettin.");
                    System.out.println("Kalan can:  " +  --can);
                }
                else {
                    hata = true;
                    System.out.println("Lutfen 0-99 arasinda bir sayı girin");
                }
                continue;
            }

            tahminler[i++] = tahmin;
            if (tahmin == sayi){
                oyunDurumu = true;
                break;
            }
            else {

                if( tahmin < sayi ){
                    System.out.println("Yanlıs. Daha büyük bir sayi girin.   Kalan can :" +  --can);
                }else {
                    System.out.println("Yanlıs. Daha kücük bir sayi girin.   Kalan can :" +  --can);
                }
            }

        }
        if (oyunDurumu){
            System.out.println("Tebrikler dogru tahmin");
            System.out.println("Sayımız: " + sayi);
            System.out.println("Kalan can: "+ can);
            System.out.println("Skorun: " + (can * 10));
        }
        else {
            System.out.println("Kaybettin!  Sayımız: " + sayi + " olacaktı!");
        }

        System.out.print("Yapılan tahminler:  ");
        for (int value : tahminler){
            if (value != 0)
            System.out.print(value + " , ");
        }
        System.out.println("\b\b");
    }
}