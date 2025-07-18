public class Hesaplayici {
    final static double PI = 3.14;      // final dedigimiz icin sonradan PI degerini degistiremeyiz artık sabit bir deger olur

    public double area(int r){
        return Hesaplayici.PI * Math.pow(r,2);    // pi * r^2
    }

}
