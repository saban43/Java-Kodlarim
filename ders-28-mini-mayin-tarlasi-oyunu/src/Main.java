import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row , col ,choise ;

        System.out.println("\t\tMayın Tarlası Oyununa Hosgeldiniz!");
        System.out.println("Mayın Tarlası 1 Oynamak İçin 1'e,Mayın Tarlası 2 Oynamak İçin 2'ye, Kuralları Öğrenmek İçin 3'e Basın ");

                while (true){
                    System.out.print("Seçimin: ");
                    choise = scan.nextInt();

                    if (choise == 3) {
                        Rules rule = new Rules();
                        rule.rules();
                    }

                    else if ( choise == 1 || choise == 9){
                        System.out.println("Oyun Başlıyor!");
                        System.out.println("Lütfen oynamak istediğiniz boyutları girirniz");
                        System.out.print("Satır sayısı: ");
                        row = scan.nextInt();
                        System.out.print("Sütun sayısı: ");
                        col = scan.nextInt();

                        MayinTarlasi mayin = new MayinTarlasi(row,col,choise);
                        mayin.run();
                        break;
                    }
                    else if ( choise == 2 || choise == 0){
                        System.out.println("Oyun Başlıyor!");
                        System.out.println("Lütfen oynamak istediğiniz boyutları girirniz");
                        System.out.print("Satır sayısı: ");
                        row = scan.nextInt();
                        System.out.print("Sütun sayısı: ");
                        col = scan.nextInt();

                        MayinTarlasi2 mayin2 = new MayinTarlasi2(row,col,choise);
                        mayin2.run();
                        break;
                    }

                    else {
                        System.out.println("Hatalı secim! 1 , 2 veya 3'ü secebilirsin");
                    }

                }
    }
}
