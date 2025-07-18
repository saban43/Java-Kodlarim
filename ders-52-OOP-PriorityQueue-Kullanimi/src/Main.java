import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue q = new PriorityQueue();
        q.add(80);
        q.add(30);
        q.add(10);
        q.add(50);

        while (!q.isEmpty()){
            System.out.println(q.poll() );
        }

    }
}