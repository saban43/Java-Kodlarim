import java.util.*;     //kütüphane eklememiz lazım. burada tüm kütüphaneleri ekledim

public class Main {
    public static void main(String[] args) {
        // - clear() Map içinde bulunan bütün degerleri siler
        // - get (Object key) Anahtara karsılık gelen objeyi döndürür
        // - put (Object key, Object value) Anahtar - deger ikilisini kayıt eder

        HashMap b = new HashMap();
        b.put("Türkiye", "Ankara");
        b.put("Fransa", "Paris");
        b.put("İngiltere", "Londra");

        System.out.println(b.get("Türkiye"));

        Set s = b.entrySet();
        Iterator i = s.iterator();

        while (i.hasNext()){
            Map.Entry item = (Map.Entry) i.next();
            System.out.println(item.getKey() + " => " + item.getValue());
        }

    }
}