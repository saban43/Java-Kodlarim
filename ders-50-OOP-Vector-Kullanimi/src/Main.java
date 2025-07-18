import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        // Vectorlerin en başta tanımlı 10 kapasitesi olur. ve her 10 yer doldukca 10 ar artar.
        Vector v = new Vector();    // burada Vector(5) girersek baslandıc kapasitesi 5 olur ve her seferinde 5 er artar
        v.add("Portakal");
        v.add("Mandalina");
        v.add("Greyfurt");
        v.add("Şeftali");
        v.add("Nektari");
        v.add("Kayısı");
        System.out.println("Boyutu: " + v.size());
        System.out.println("Kapasitesi: " + v.capacity());

        v.remove(0);
        System.out.println(v.firstElement());



    }
}