import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("1: Rastgele bilgi \n" +
                           "2: Hava durumu \n" +
                           "3: Turkiyenin en iyi futbol takimi\n");

        System.out.println("1 , 2 , 3 tuslarindan birine basin lutfen \n");
        int secim = input.nextInt();

        switch (secim){
            case 1: System.out.print("Bir renkli kursun kalemin bitebilmesi için 56 kilometrelik cizgi cizmek gerekir.");
                    break;
            case 2: System.out.print("Hava cok sicak cidden :)");
                    break;
            case 3: System.out.print("Fenerbahceeee sen cok yasaaaa canim feda olsun sanaaaaaaaaa!!!!!");
                    break;
            default: System.out.print("1,2 veya 3 tuslarina basman lazimdi!!");
                    break;
        }

    }
}
