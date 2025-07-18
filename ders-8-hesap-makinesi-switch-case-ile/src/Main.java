import java.util.Scanner;

// bu derste hesap makinesi yapıyoruz ancak extra bilgiler var haberin olsun

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double sayi1, sayi2, sonuc = 1 ;

        String yapilacakIslem = "0";

    System.out.println("#############################  MENÜ  ##################################################################");
        System.out.print("\t\tYapmak İstediğiniz İşlemi Seçiniz (çıkmak için -1 e basın)\n" +
                "+: toplama\t" +
                "-: çıkarma\t" +
                "*: çarpma\t" +
                "/: bölme\t" +
                "%: mod alma\t " +
                "2: kare alma\t" +
                "us: üs alma (kesirli)\t" +
                "pow: üs alma (ondalıklı)" +
                "k: karekök alma\n");
        System.out.println("#######################################################################################################");

        while (yapilacakIslem != "-1") {
            System.out.print("\nYapmak istediğin işlem: ");
            yapilacakIslem = input.next();


            switch (yapilacakIslem) {
                case "+":
                    System.out.print("İlk sayıyı giriniz: ");
                    sayi1 = input.nextDouble();
                    System.out.print("İkinci sayıyı giriniz: ");
                    sayi2 = input.nextDouble();
                    System.out.println("Girdiğiniz sayıların toplamı: " + (sayi1 + sayi2));
                    break;

                case "-":
                    System.out.print("İlk sayıyı giriniz: ");
                    sayi1 = input.nextDouble();
                    System.out.print("İkinci sayıyı giriniz: ");
                    sayi2 = input.nextDouble();
                    System.out.println("Girdiğiniz sayıların farkı: " + (sayi1 - sayi2));
                    break;

                case "*":
                    System.out.print("İlk sayıyı giriniz: ");
                    sayi1 = input.nextDouble();
                    System.out.print("İkinci sayıyı giriniz: ");
                    sayi2 = input.nextDouble();
                    System.out.println("Girdiğiniz sayıların çarpımı: " + (sayi1 * sayi2));
                    break;

                case "/":
                    System.out.print("İlk sayıyı giriniz: ");
                    sayi1 = input.nextDouble();
                    System.out.print("İkinci sayıyı giriniz: ");
                    sayi2 = input.nextDouble();
                    if (sayi2 == 0) {
                        System.out.println("Payda sıfır olamaz!");
                        continue;
                    } else {
                        System.out.println("Girdiğiniz sayıların bölümü: " + (sayi1 / sayi2));
                        break;
                    }

                case "%":
                    System.out.print("İlk sayıyı giriniz: ");
                    sayi1 = input.nextDouble();
                    System.out.print("İkinci sayıyı giriniz: ");
                    sayi2 = input.nextDouble();
                    System.out.println("Girdiğiniz sayıların modu: " + (sayi1 % sayi2));
                    break;

                case "2":
                    System.out.print("Karesini almak istediğiniz sayıyı giriniz: ");
                    sayi1 = input.nextDouble();
                    System.out.println("Girdiğiniz sayının karesi: " + (sayi1 * sayi1));
                    break;
                case "us":
                    System.out.print("Üssünü almak istediğiniz sayıyı giriniz: ");
                    sayi1 = input.nextDouble();
                    System.out.print("Hangi üssü almak istersiniz: ");
                    sayi2 = input.nextDouble();
                    if (sayi2 == 0) {
                        System.out.println(sayi1 + " üzeri " + 0 + " = " + 1);
                    }
                     else if (sayi2 > 0) {
                        System.out.print(sayi1 + " üzeri " + sayi2 + " = ");
                        for (int i = 0; i < sayi2; i++) {
                            sonuc *= sayi1;
                        }
                        System.out.println(sonuc);
                        sonuc = 1;
                    } else if (sayi2 < 0) {
                        System.out.print(sayi1 + " üzeri " + sayi2 + " = 1/");
                        if(sayi2 % 2 == 0){
                            for (int i = 0; i < sayi2; i++) {  //eger sayi2 yani üssümüz 2 nin katıysa bunu yap
                                sonuc *= sayi1;
                            }
                            System.out.println(sonuc);
                            sonuc = 1;
                        }
                        else {
                            sayi2 *= -1;
                            for (int i = 0; i < sayi2 ; i++) {   //eger sayi2 yani üssümüz 2 nin katı degilse bunu yap
                                sonuc *= sayi1;
                            }
                            System.out.println(sonuc);
                        }

                    }

                    break;
                case "k":
                    System.out.print("Karekök almak istediğiniz sayıyı giriniz: ");
                    sayi1 = input.nextDouble();
                    sonuc=Math.sqrt(sayi1);
                    System.out.print("Girdiğiniz sayinin karekökü: " + sonuc);
                    sonuc = 1;
                    break;

                case "pow":
                    System.out.print("Üs almak istediğiniz sayıyı giriniz: ");
                    sayi1 = input.nextDouble();
                    System.out.print("Hangi üssü almak istersiniz: ");
                    sayi2 = input.nextDouble();
                    sonuc = Math.pow(sayi1, sayi2);
                    System.out.print("Girdiğiniz sayının üssü: " + sonuc);
                    sonuc = 1;
                    break;

                default:
                    System.out.println("Geçerli bir işlem seçmediniz!");
                    break;
            }
        }
        System.out.print("\n\n\nHesap makinemizi kullandığınız için teşekkürler :) \n");
    }

}
