
public class Main {
    public static void main(String[] args) {
        //Array
        //VeriTipi diziAdi[] = new VeriTipi[ eleman sayisi ];
        //VeriTipi[] diziAdi = new VeriTipi[ eleman sayisi ];
        //VeriTipi[] diziAdi = {v1,v2,v3,v4};

        int[] liste = new int[4];

        liste[0] = 5;
        liste[1] = 10;
        liste[2] = 15;
        liste[3] = 20;

        for (int i = 0; i <liste.length ; i++) {
            System.out.println(liste[i]);
        }
        System.out.println("\n------------------------");

        // foreach kullanimi
        for (int value : liste){
            System.out.print(value + " ");
        }
    }
}