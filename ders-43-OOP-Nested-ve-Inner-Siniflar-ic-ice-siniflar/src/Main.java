
public class Main {
    public static void main(String[] args) {
        // Nested Class (İç içe sınıflar)
        //  -Inner Class (İç sınıflar)
        //      -Static
        //      -Non Static
        //  -Local Class (Yerel Sınıflar)
        //  -Anonymous Class (Anonim Sınıflar)

        NonStatic n = new NonStatic();
        NonStatic.Inner inner = n.new Inner();
        inner.run();

        System.out.println("-------------------");

        Static.Inner s = new Static.Inner();
        s.run();

        System.out.println("-------------------");
        Local l = new Local();
        l.run();

        System.out.println("-------------------");
        Anonim a = new Anonim(){
            public void run(){
                System.out.println("Anonim sınıfına ait run metodu");
            }
            public void print(){
                System.out.println("print");
            }
        };

        a.run();
        //a.print();    burada hata alırız çünkü override edemiyor


    }
}