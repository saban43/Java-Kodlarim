public class Book {
    private String name,author,publisher;        // isim,yazar,yayıncı
    private int numberOfPage;        // sayfa sayısı

    Book(String name,String author,String publisher,int numberOfPage){
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        if ( numberOfPage < 0){
            this.numberOfPage = 0;
        }
        else {
            this.numberOfPage = numberOfPage;
        }
    }

    public void pageSize(){
        System.out.println(numberOfPage);
    }

    // Getter metodu , diger yazilimcilarin kodunuzu okurken anlamasını saglamak icin kullanılan bir jargon diyebiliriz
    // Getter metodunu bir degeri geri döndürmek icin kullanırız

    public int getNumberOfPage(){
        return numberOfPage;
    }

    // Setter metodu , diger yazilimcilarin kodunuzu okurken anlamasını saglamak icin kullanılan bir jargon diyebiliriz
    // Setter metodunu bir degeri değistirmek icin kullanırız

    public void setNumberOfPage(int size){
        this.numberOfPage = size;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // eger sol üstteki 3 cizgiye basıp code kısmından generate ye basarsak otomatik setter ve getter codlarını program yazar
}
