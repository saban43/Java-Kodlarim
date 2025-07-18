import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean asal = true;
        int number;
        do {
            System.out.print("Lütfen pozitif bir tam sayı giriniz: ");
            number = scan.nextInt();
        }while (number < 2);            // do dongusunde girilen sayinin en az 2 olmasi saglaniyor


        for (int i = 2; i <number; i++) {
            if (number % i == 0) {
                asal = false;
                break;
            }
        }

        if (asal){
            System.out.println("Girilen sayi:" + number + " asaldır.");
        }
        else {
            System.out.println("Girilen sayi :" + number + " asal değildir.");
        }




    }
}