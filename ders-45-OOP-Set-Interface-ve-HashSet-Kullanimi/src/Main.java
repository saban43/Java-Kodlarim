import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        // h. dediğimizde hashsete ait birçok metod görebiliriz

        h.add("12 on iki");
        h.add(12);
        h.add(12);
        h.add(12);  // aynı türde ayn ı elemana ait birden fazla sey olamaz o yüzden ekrana yazdırırken sadece bir tane 12 yazacaktır
        h.add(12.0);
        h.add(true);
        h.add(null);

        h.remove(12.0);     //silmek istediğin şeyi yazıyosun

        Iterator itr = h.iterator();

        while (itr.hasNext()){         //tüm elemanlara ulasabilmek ve ekrana yazabilmek için döngü ve iterator kullandık
            System.out.println(itr.next());
        }
        System.out.println("-------------------------------------------------------------------------");

        // forEach ile döngü kullanmadan elemanları yazdırma
        h.forEach(item -> System.out.println(item + " "));



        //contains true-false dödürür
        System.out.println(h.contains(12));

        h.clear();      //herşeyi siler
        while (itr.hasNext()){
            System.out.println(itr.next());     //brada ekrana hiçbirsey yazdırmıyor
        }

    }
}