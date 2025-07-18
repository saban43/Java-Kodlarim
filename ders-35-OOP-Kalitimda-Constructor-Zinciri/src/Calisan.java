public class Calisan {
    protected String adSoyad, ePosta , telefon;

    public Calisan(String adSoyad, String telefon ,String ePosta) {
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.ePosta = ePosta;

    }

    protected void giris(){
        System.out.println("Çalısan giris yaptı!" );
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getePosta() {
        return ePosta;
    }

    public void setePosta(String ePosta) {
        this.ePosta = ePosta;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
