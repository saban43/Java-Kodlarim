import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // palindromik kelimeler kendisi ile ters okunusu aynı olan kelimelerdir
        // mesela kapak yatay teğet gibi  |  Ayrıca bu program palindromik sayıları da bulur

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine() ;
        String  temp = "" ;

        for (int i = str.length()-1 ; i >= 0 ; i--) {
            temp += str.charAt(i);      // charAt  konumu verilen karakteri okur
        }

        if ( temp.equals(str)){
            System.out.println("Palindromik kelime");
        }
        else {
            System.out.println("Palindromik kelime degil!");
        }
    }
}