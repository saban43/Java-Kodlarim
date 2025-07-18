import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // - element() Kuyrugun basındaki ögeyi verir, ama onu kuyruktan atmaz
        // - offer (E o) Mümkünse, verilen ögeyi kuyruga ekler
        // - peek() Kuyrugun basındaki ögeyi verir ,ama onu kuyruktan atmaz, kuyruk boşsa null verir
        // - poll() Kuyrugun basındaki ögeyi verir ve onu kuyruktan atar.kuyruk boşsa null verir
        // - remove() Kuyrugun basındaki ögeyi verir ve onu kuyruktan atar

        Queue q = new LinkedList();
        q.add("Şaban");
        q.add("Ferman");
        q.add("Mali");
        q.add("Enes");
        q.add("Mümin");

        System.out.println("remove() : " + q.remove() + "\n");
        System.out.println("element() : " + q.element());
        System.out.println("peek() : " + q.peek());


        q.forEach(item -> System.out.println(item));    //firs in firs out kuralı var

    }
}