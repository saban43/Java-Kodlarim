public class Hademe extends Calisanlar{

    private int prim;

    public Hademe(String isim, String gorev,int maas,int prim) {
        super(isim,gorev,maas);
        this.prim=prim;
    }

    public void maasHesapla(){
        super.maasHesapla();
        System.out.println("+" + this.prim);
    }

    public int onIkiAylikMaas(){
        return (12 * super.maas) + prim;
    }
}
