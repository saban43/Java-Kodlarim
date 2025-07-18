
public class Main {
    public static void main(String[] args) {

    byte byteSayisi = 10;
    System.out.println("byte sayisinin degeri: " + byteSayisi);
    short shortSayisi = 1000;
    System.out.println("short sayisinin degeri: " + shortSayisi);
    int intSayisi = 1907;
    System.out.println("short sayisinin degeri: " + intSayisi);
    long longSayisi = 100000000;
    System.out.println("short sayisinin degeri: " + longSayisi);

//-----------------------------------------------------------------------------------------------------------

    float sayi1 = 43.5f;        // floatda ondalıklı bir deger girerken sonuna f veya F koymalıyız
    float sayi2 = 43.79F;       // degisken turunu float yazsakda program bunu anlamayacaktır
    float sayi3 = 43;           // float bir degerde integer bir deger gibi yazarsak f yazmaya gerek yok ,makina 43.0 olarak okur


    double sayi4 = 4380;
    double sayi5 = 28.36;       // double da f veya F yazmaya gerek yok

        System.out.println(sayi1);
        System.out.println(sayi2);
        System.out.println(sayi3);
        System.out.println(sayi4);
        System.out.println(sayi5);

//-----------------------------------------------------------------------------------------------------------------

    char karakter = 'a';            // char veri turunde tek tırnak kullanmalıyız. cift tirnak string olur!
    System.out.println(karakter);
    char karakter2 = 97;
    System.out.println(karakter2);      // a nın ascıı kod degeri 97 oldugu icin ekrana a yazar


    boolean dogru = true;
    System.out.println(dogru);
    boolean yanlis = false;
    System.out.println(yanlis);

    //***************************************************************

    String str = "Merhaba gardasim!";       // stringler bu sekil kullanilir
    System.out.println(str);


        }
    }
