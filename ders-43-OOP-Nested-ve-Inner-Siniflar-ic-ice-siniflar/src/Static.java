public class Static {
    private int a = 5;
    private static int b = 20;

    public static class Inner{
        int a = 2;

        public void run(){
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(b);

        }
    }
}
