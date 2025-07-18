public class Memurlar extends Calisan{       // artık Memurlar ,calisanin bir alt sınıfıdır

    String departman,mesai;

    public Memurlar(String adSoyad, String telefon, String ePosta, String departman , String mesai) {
        super(adSoyad, telefon, ePosta);
        this.departman = departman;
        this.mesai = mesai;
    }
}
