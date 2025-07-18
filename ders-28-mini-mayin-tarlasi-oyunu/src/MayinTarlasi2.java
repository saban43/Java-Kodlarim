import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi2 {

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    int rowNumber, colNumber, size;     //haritamizin satır ve sütun sayıları
    int[][] map;
    int[][] board;
    boolean game = true;
    int choise; // hile kullanımı için

    MayinTarlasi2(int rowNumber, int colNumber, int choise) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
        this.choise = choise;
    }

    public void run() {
        int row, col, success = 0;
        prepareGame();

        if (choise == 0) {
            System.out.println("Hile Acık! Oyun Haritası:");    //hile kısmı
            printMap(map);                                     //hile kısmı
        }

        System.out.println("Oyun başladı!");
        while (game) {
            printMap(board);
            System.out.print("Satır: ");
            row = scan.nextInt();
            row = row - 1;    // sıfırıncı satır yazmayacagımız icin böyle bir eklenti yaptık
            System.out.print("Sütun: ");
            col = scan.nextInt();
            col = col - 1;    // sıfırıncı satır yazmayacagımız icin böyle bir eklenti yaptık

            if (row < 0 || row >= rowNumber) {
                System.out.println("Gecersiz koordinat!");
                continue;
            }
            if (col < 0 || col >= colNumber) {
                System.out.println("Gecersiz koordinat!");
                continue;
            }

            if (map[row][col] != -1) {
                if (board[row][col] != 0) {
                    System.out.println("Ne yapmaya çalışıyorsun manyak adam!");
                    continue;
                }
                checkBomb(row, col);
                success++;
                if (success == (size - (size / 4))) {
                    System.out.println("Tebrikler! Oyunu Basariyla Kazandın!");
                    break;
                }
            } else {
                game = false;
                System.out.print("Mayına bastın ve havaya uctun! Oyun bitti!");
                System.out.println("Bombalarin yerleri:");
                printMap(map);
            }
        }
    }

    public void prepareGame() {
        int randBombRow, randBombCol, count = 0;

        while (count != (size / 4)) {
            randBombRow = rand.nextInt(rowNumber);
            randBombCol = rand.nextInt(colNumber);

            if (map[randBombRow][randBombCol] != -1) {
                map[randBombRow][randBombCol] = -1;
                count++;
            }
        }
    }

    public void checkBomb(int r, int c) {        //girilen yerin etrafını kontrol ettigimiz kısım
        if (map[r][c] == 0) {
            if ((c < colNumber - 1) && (map[r][c + 1] == -1)) {
                board[r][c]++;
            }
            if ((c < colNumber - 1) && (r < rowNumber - 1) && (map[r + 1][c + 1] == -1)) {
                board[r][c]++;
            }
            if ((c > 0) && (map[r][c - 1] == -1)) {
                board[r][c]++;
            }
            if ((c > 0) && (r > 0) && (map[r - 1][c - 1] == -1)) {
                board[r][c]++;
            }
            if ((r < colNumber - 1) && (map[r + 1][c] == -1)) {
                board[r][c]++;
            }
            if ((r < rowNumber - 1) && (c > 0) && (map[r + 1][c - 1] == -1)) {
                board[r][c]++;
            }
            if ((r > 0) && (map[r - 1][c] == -1)) {
                board[r][c]++;
            }
            if ((r > 0) && (c < colNumber - 1) && (map[r - 1][c + 1] == -1)) {
                board[r][c]++;
            }

            if (board[r][c] == 0) {
                board[r][c] = -2;
            }
        }

    }

    public void printMap(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
