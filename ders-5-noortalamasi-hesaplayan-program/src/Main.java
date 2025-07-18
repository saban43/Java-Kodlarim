import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int quiz , vize , finall;
        double ortalama;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Quiz notunu giriniz: ");
        quiz = girdi.nextInt();
        System.out.print("Vize notunu giriniz: ");
        vize = girdi.nextInt();
        System.out.print("Final notunu giriniz: ");
        finall = girdi.nextInt();

        ortalama = (quiz * 0.2) + (vize * 0.35) + ( finall * 0.45);
        String sonuc = (ortalama >= 40) ? "Tebrikler dersi basariyla gectiniz" : "Malesef dersi gecemediniz";

        System.out.println(sonuc + "\n" + "Ortalama notunuz: "+ ortalama );


        }
    }
