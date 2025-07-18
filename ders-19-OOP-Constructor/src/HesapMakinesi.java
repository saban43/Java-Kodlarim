    // biz siniflar icine fonksiyonlar olustururuz ve degiskenler tanimlayabiliriz

public class HesapMakinesi {
    public int sayi1;
    public int sayi2;
    public String renk;

    HesapMakinesi(int number1,int number2,String renk){
        //this.sayi1 demek classın icindeki sayi1 i kullan demek yani ustteki sayi1
        this.sayi1 = number1;
        this.sayi2 = number2;
        this.renk = renk;
    }

    public int toplama(){
        return this.sayi1 + this.sayi2;
    }

    public int cikarma(){
        return this.sayi1 - this.sayi2;
    }

    public int carpma(){
        return this.sayi1 * this.sayi2;
    }

    public int bolme(){
        return this.sayi1 / this.sayi2;
    }
}
