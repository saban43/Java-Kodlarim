
public class Main {
    public static void main(String[] args) {

        System.out.print("Merhaba ");
        System.out.println("Dünya!");  // Eger println yazarsak otomatin \n atmış olur ve sıradaki islem alt satırda olur
        System.out.print("hello world! \n");   // Burada da manuel olarak \n koyduk

        System.out.println("Merhaba, benim adım Saban, " + "soyadim ise Erken");  // Bu sekilde iki farklı yaziyi birlestirip yazdık

        System.out.println(10 + "15");      // tirnak icini bir karakter gibi algılar ve 1015 yazar
        System.out.println(10 + 15);        // ancak burada iki sayiyi toplayıp ekrana 25 yazar

        System.out.print("\t Hello and welcome!");  //\t bir tab'lik bosluk olusturur

    }
}