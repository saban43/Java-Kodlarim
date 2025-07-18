import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // < > Generic (jenerik) Tipler
        // Bir listenin sadece tek tip sınıftan olması icin kullanabiliriz

        ArrayList<String> a = new ArrayList<>();
        a.add("str");
        // a.add(true);     //hata verecektir cünkü arraylisti String olarak tanımladık

        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Double> c = new ArrayList<>();

        b.add(1);
        b.add(2);

        for (Integer obj : b){
            System.out.println(obj);
        }
System.out.println("----------------------------------------------------");

        for (Integer obj : b){
            System.out.println(obj.doubleValue());
        }
System.out.println("----------------------------------------------------");

        HashMap<Integer,String> d = new HashMap<>();
        d.put(77,"Yalova");
        d.put(6,"Ankara");
        d.put(34,"İstanbul");

        for (Integer key : d.keySet()){
            System.out.println("Key: " + key + " - Value: " + d.get(key));
        }
System.out.println("----------------------------------------------------");

        for (String value : d.values()){
            System.out.println(value);
        }

System.out.println("========================================================");
        // Test classını test edelim

        Test<Integer> i = new Test<Integer>(15);
        System.out.println(i.getObj());

        Test<String> s = new Test<String>("Ankara");
        System.out.println(s.getObj());

System.out.println("========================================================");
        // Test2 classını test edelim

        Test2<Integer,String> k = new Test2<>(43,"Kütahya");
        k.print();

        Test2<Integer,String> u = new Test2<>(63,"Urfa");
        u.print();

System.out.println("========================================================");
        //GenericMethod classını test edelim

        Integer[] intArr = {1,2,3,4};
        Double[] doubleArr = {1.1 , 2.1 , 3.1 , 4.1};
        Character[] chaArr = {'a','b','c'};

        genericMethod(intArr);
        genericMethod(doubleArr);
        genericMethod(chaArr);

    }

    // GenericMethod Classı
    public static <E> void genericMethod(E[] arr){
        for (E item : arr){
            System.out.println(item);
        }
    }
}