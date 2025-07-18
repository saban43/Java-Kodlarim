
public class Main {
    public static void main(String[] args) {

        Calisanlar A = new Hademe("Ahmet","guvenlik",20000,100);
        // cok bicimcilik ilkesi

        // neden cok bicimcilik var?

        Calisanlar B = new Calisanlar("Murat","Müdür",40000);
        Hademe C = new Hademe("Engin","hademe",3000 ,100);

        Calisanlar[] girisListesi = {A,B,C};

        Calisanlar.listele(girisListesi);
    }
}