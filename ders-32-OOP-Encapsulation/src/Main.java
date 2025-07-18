
public class Main {
    public static void main(String[] args) {
        // Encapsulation (Sarmallama,Kapsülleme)

        Book b1 = new Book("Şeker Portakali","José Mauro de Vasconcelos","Can",184);
        b1.pageSize();

        // Getter Metodu Kullanımı
        System.out.println(b1.getNumberOfPage());

        //Setter Metodu Kullanımı
        b1.setNumberOfPage(300);
        System.out.println(b1.getNumberOfPage());

    }
}