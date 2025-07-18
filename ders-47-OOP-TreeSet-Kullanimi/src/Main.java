import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // TreeSet de elementler artan bir sıra ile tutulur ve null kabul etmez
        TreeSet tree = new TreeSet();

        tree.add(10);
        tree.add(7);
        tree.add(9);
        tree.add(3);
        tree.add(6);

        try{
            tree.add(null);
        }catch (Exception e){
            System.out.println(e.toString());
        }

        tree.forEach(item -> System.out.println(item));
    }
}