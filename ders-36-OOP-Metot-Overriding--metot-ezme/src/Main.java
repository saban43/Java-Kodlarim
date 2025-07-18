
public class Main {
    public static void main(String[] args) {

        Calisanlar A = new Calisanlar("Ahmet","guvenlik",20000);
        A.maasHesapla();

        Baskanlar B = new Baskanlar("Murat","Müdür",40000);
        B.maasHesapla();

        Hademe C = new Hademe("Engin","hademe",3000 ,100);

        System.out.println(   C.toString()  +  C.onIkiAylikMaas());

    }
}