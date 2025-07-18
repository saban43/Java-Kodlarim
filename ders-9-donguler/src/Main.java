
public class Main {
    public static void main(String[] args) {

        //while döngüsü
        int i= 1;
        while (i<=5){
            System.out.print( i + " ,");
            i++;
        }
        System.out.println("\b");     // \b son elemanı silmeye yarar. Bu sayede sondaki virgulu sildik

        System.out.println("*******************");
        i = 10;

        //do while döngüsü
        do {
            System.out.println( i + " ,");
            i++;
        }while (i<5);

        System.out.println("*******************");
        //for döngüsü
        for (int j = 0; j <= 10; j++) {
            System.out.print(j + " ");
        }

        System.out.println("\n*******************");
        // break
        for (int j = 0; j < 10; j++) {
            if(j == 7){
                break;
            }
            System.out.print(j + " ");
        }

        System.out.println("\n*******************");
        // continue
        for (int j = 0; j < 10; j++) {
            if(j == 1 || j == 3 || j == 5 || j == 7){
                continue;
            }
            System.out.print(j + " ");
        }



    }
}