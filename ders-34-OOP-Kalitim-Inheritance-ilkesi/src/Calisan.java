public class Calisan {
    String adSoyad, ePosta;
    int telefon;
    static int girisSayisi = 0;



    protected void giris(){
        System.out.println("Çalısan giris yaptı!" );
        System.out.println("Toplam giriş yapan çalısan sayısı: "+ getGirisSayisi());
    }
    protected static int getGirisSayisi(){
        return ++Calisan.girisSayisi;
    }


}
