
        // OOP - Constructor (Yapıcı) Kullanımı ve Sınıf Metodları

public class Siniflar {
    public static void main(String[] args) {
    /*
        HesapMakinesi makine1;
        makine1 = new HesapMakinesi(1,3);  //Constructer new'den sonraki kisim

        makine1.sayi1 = 5;
        System.out.println(makine1.sayi1 +" - "+ makine1.sayi2);
        //cıktı olarak 5 -- 3 verecektir
     */

        HesapMakinesi m1 = new HesapMakinesi(10,5,"siyah");
          System.out.println( m1.toplama() );
          System.out.println( m1.cikarma() );
          System.out.println( m1.carpma() );
          System.out.println( m1.bolme() );

        HesapMakinesi m2 = new HesapMakinesi(40,4,"mavi");
          System.out.println( m2.toplama() );
          System.out.println( m2.cikarma() );
          System.out.println( m2.carpma() );
          System.out.println( m2.bolme() );

    }
}