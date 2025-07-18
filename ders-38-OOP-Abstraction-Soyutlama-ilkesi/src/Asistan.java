public class Asistan extends Akademisyen{
    String yuksekLısans;

    public Asistan(String bolum, String gorevler, String ders) {
        super(bolum, gorevler, ders);
    }

    @Override
    public void derseGir(int dersSaati) {
        System.out.println("Asistan saat "+dersSaati +"'de derse giris yapti");
    }


}
