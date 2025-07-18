
public class CokBoyutluDizi {
    public static void main(String[] args) {
        // cok boyutlu dizi
        int[][] tablo1 = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12},
                {13,14,15}
        };

        int[][] tablo2 =new int[2][3];
        tablo2[0][0] = -1;
        tablo2[0][1] = -2;
        tablo2[0][2] = -3;
        tablo2[1][0] = -4;
        tablo2[1][1] = -5;
        tablo2[1][2] = -6;

        for (int i = 0; i < tablo1.length; i++) {

            for (int j = 0; j < tablo1[0].length; j++) {
                System.out.print(tablo1[i][j] + " ");
            }
        }

        System.out.println("\n------------------------");

        // foreach kullanimi
        for ( int[] row : tablo2 ){
            for (int value : row){
                System.out.print(value  + " ");
            }
        }
    }
}