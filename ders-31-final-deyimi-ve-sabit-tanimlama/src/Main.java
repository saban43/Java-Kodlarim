
public class Main {
    public static void main(String[] args) {
        System.out.println(Hesaplayici.PI);     // static sayesinde nesne üretmeden kullanabiliyoruz

        Hesaplayici m1 = new Hesaplayici();
        System.out.println(m1.area(10));

    }
}