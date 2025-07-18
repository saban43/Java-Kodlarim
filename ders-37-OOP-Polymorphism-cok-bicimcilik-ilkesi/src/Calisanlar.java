public class Calisanlar {
    protected int maas;
    private String isim;
    private String gorev;


    public Calisanlar(String isim, String gorev,int maas) {
        this.isim = isim;
        this.gorev = gorev;
        this.maas = maas;
    }

    public String giris(){
        return this.isim + " giris yaptı";
    }


    public static void listele( Calisanlar[] girisYapanlar){
        for (Calisanlar A : girisYapanlar){
            System.out.println(A.giris());
        }
    }
}
