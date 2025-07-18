
public class Main {
    public static void main(String[] args) {
       // Akademisyen a =new Akademisyen() ;
        // Burada hata alıcaz cünkü akademisyeni abstrack olarak tanımladık.Bisey üretemeyiz

        Asistan asistan1 = new Asistan("stajyer","köle","kodlama");
        asistan1.derseGir(12);
    }
}