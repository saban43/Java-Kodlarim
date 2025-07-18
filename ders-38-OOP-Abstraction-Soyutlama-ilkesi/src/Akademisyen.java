public abstract class Akademisyen {
    String bolum,gorevler,ders;

    public Akademisyen(String bolum, String gorevler, String ders) {
        this.bolum = bolum;
        this.gorevler = gorevler;
        this.ders = ders;
    }

    public abstract void derseGir(int dersSaati);
    // içi bos bile olsa Asistan classında derseGir metodu tekrar etmek zorunda cünkü abstract metot yazdık
}
