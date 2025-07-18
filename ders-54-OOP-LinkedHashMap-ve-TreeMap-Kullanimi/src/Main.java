import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap ogr = new LinkedHashMap();        // key degere göre sıralama yapacaktır
        ogr.put("Ali",90);
        ogr.put("Ahmet",80);
        ogr.put("Murat",75);

        Set set = ogr.entrySet();

        Iterator i = set.iterator();

        while (i.hasNext()){
            Map.Entry item = (Map.Entry) i.next();
            System.out.println(item.getKey() + " => " + item.getValue());
        }

        System.out.println("-------------------------------------------------");

        TreeMap ogr2 = new TreeMap();   //value degere göre sıralama yapacaktır
        ogr2.put("Ali",90);
        ogr2.put("Ahmet",80);
        ogr2.put("Murat",75);

        Set set2 = ogr2.entrySet();

        Iterator i2 = set2.iterator();

        while (i2.hasNext()){
            Map.Entry item = (Map.Entry) i2.next();
            System.out.println(item.getKey() + " => " + item.getValue());
        }


    }
}