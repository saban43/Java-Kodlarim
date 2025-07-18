public class Calisanlar {
    protected int maas;
    private String isim;
    private String gorev;


    public Calisanlar(String isim, String gorev,int maas) {
        this.isim = isim;
        this.gorev = gorev;
        this.maas = maas;
    }

    public void maasHesapla(){
        System.out.println("isim= " + this.isim +" ,Görev= " + this.gorev + " ,Maaşı= " + (this.maas ));
    }

    public int onIkiAylikMaas(){
        return 12 * maas;
    }

    public String toString() {
        return "isim= " + isim +
                ", gorev= " + gorev + " Maas= ";
    }

    // Burada maasHesapla methodunu override etmiş olduk çünkü aynı methodu Baskanlar clasında da kullandık



}
