
public class Main {
    public static void main(String[] args) {

        // Sınıflar arası ilişkiler
        //- Bağımlılık (Dependency) "uses a"  A uses B
        //- Birleştirme (Composition) "has a"
        //- Kalıtım (Inheritance) "is a"

        A a = new A();
        B b = new B();
        //Bağımlılık
        a.run(b);

        //Birleştirme
        a.b = b ;


    }
}