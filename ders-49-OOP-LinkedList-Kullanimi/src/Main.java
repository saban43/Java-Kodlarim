import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // LinkedList ile ArrayList Farkları
        // LinkedListler arama yaparken O(n) zamanda yaparken ArrayListler O(1) zamanda yapar. Çünkü arama algoritmaları farklıdır.
        // LinkedListlerde silme yaparken o(") zamanda yaparken ArrayListlerde O(n) zamanda yapar.
        // Yani arama yapmak icin ArrayList daha mantıklı iken silme islemi için linkedList daha mantıklı olacaktır

        LinkedList list = new LinkedList();

        list.add("Armut");
        list.add("Üzüm");
        list.add("Çilek");
        list.add("Muz");
        list.add(1,"Ananas");

        list.forEach(item -> System.out.println(item));

    }
}