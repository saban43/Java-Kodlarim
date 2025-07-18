import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // listlerde, setlerden farklı olarak tekrar eden degerleri ekler

        ArrayList country = new ArrayList();
        country.add("Ankara");
        country.add("Yalova");
        country.add("İstanbul");
        country.add("Urfa");
        country.add("Kütahya");
        country.add("Yalova");  //yalova olmasına ragmen tekrar ekleyecek

        country.add(0,"Eskişehir");     //istediğimiz index e de ekleyebiliriz
        country.remove(1);      //istediğimiz index deki elemanı silebiliriz

        country.forEach(item -> System.out.println(item));

    }
}