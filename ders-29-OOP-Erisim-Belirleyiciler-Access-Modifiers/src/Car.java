public class Car {
    private int enginePower, model;    //private: ana fonksiyonda kullanılamaz
    public int speed;   //diger paketlerde de kullanılabilinir
    protected String color; // sadece bu pakette kullanılabilinir

        Car(){
            this.model = 2020;
            this.enginePower = 300;
            this.speed = 120;
            this.color = "yellow";
        }

        private void print(){
            System.out.println(model);
        }
        public void run(){
            print();
        }
}
