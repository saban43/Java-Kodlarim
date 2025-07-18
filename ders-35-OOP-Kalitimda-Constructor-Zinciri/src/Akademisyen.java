public class Akademisyen  extends Calisan {       // artık akademisyen ,calisanin bir alt sınıfıdır

    String bolum,gorevler;
    String[] dersler;

    public Akademisyen(String adSoyad, String telefon, String ePosta, String bolum, String gorevler, String dersler) {
        super(adSoyad, telefon, ePosta);        // super fomksiyonu sayesinde üstteki sınıfa erisebiliyoruz
        this.bolum = bolum;
        this.gorevler = gorevler;
        // this.dersler = dersler;
    }

    public void derseGir(){

    }
}