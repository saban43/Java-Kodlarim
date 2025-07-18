
public class Main {
    public static void main(String[] args) {

    int a = 30;
    int b = 5;
    int toplam = a + b;
    int cikarma = a - b;
    int carpma = a * b;
    int bolme = a / b;
    int mod = a % b;
    System.out.println("toplam: " + toplam);
    System.out.println("cikarma: " + cikarma);
    System.out.println("carpma: "+ carpma);
    System.out.println("bolme: "+ bolme);
    System.out.println("mod: "+ mod);

    b++;
    System.out.println("b:"+ b);

    a-=5;
    System.out.println("a:"+ a);


    System.out.println("---------------------------------------");
    boolean kosul1 = (a - b) == 0;
    System.out.println("kosul 1: " + kosul1);
    boolean kosul2 = a > b;
    System.out.println("kosul 2: " + kosul2);

    boolean sonuc1 = kosul1 || kosul2;
    boolean sonuc2 = kosul1 && kosul2;

    System.out.println("sonuc1: "+ sonuc1);
    System.out.println("sonuc2: "+ sonuc2);

    String sonuc3 = (kosul1) ? "Dogru" : "Yanlis";
    System.out.println("sonuc 3: "+ sonuc3);

    String sonuc4 = (a == b) ? "a ve b esitler" : "a ve b esit degiller";
    System.out.println("sonuc 4: "+ sonuc4);
    }
}