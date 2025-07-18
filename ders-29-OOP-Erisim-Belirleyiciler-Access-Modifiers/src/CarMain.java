
public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();

        // car1.print(); fonksiyonunu calıstıramayız cünkü private seklinde
        // ancak baska bir fonksiyonda kullanarak cagırabiliriz
        car1.run();
    }
}