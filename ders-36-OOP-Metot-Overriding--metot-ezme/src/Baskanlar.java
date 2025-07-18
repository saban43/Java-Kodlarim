public class Baskanlar {
    private String isim;
    private String gorev;
    private int maas;


    public Baskanlar(String isim, String gorev,int maas) {
        this.isim = isim;
        this.gorev = gorev;
        this.maas = maas;
    }


    public void maasHesapla(){
        System.out.println("isim= " + this.isim +" ,Görev= " + this.gorev + " ,Maaşı= " + (this.maas + 2000));  // baskanlara 2000 fazla bonus
    }

    // Burada maasHesapla methodunu override etmiş olduk çünkü aynı methodu Calisanlar clasında da kullandık
}
