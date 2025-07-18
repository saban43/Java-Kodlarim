// method demek fonksiyon demek aslinda
public class Main {

    //sum(int,int)
    static int sum(int a,int b){
        System.out.println("1.method");
        return a + b ;
    }

    //sum(int,int,int)
    static int sum(int a,int b,int c){
        System.out.println("2.method");
        return a + b + c ;
    }

    //sum(int,int,double)
    static double sum(int a,int b,double c){
        System.out.println("3.method");
        return a + b + c ;
    }

    public static void main(String[] args) {

        System.out.println(sum(1,2));
        System.out.println(sum(1,2,5));
        System.out.println(sum(1,2,9.4));
    }

}
