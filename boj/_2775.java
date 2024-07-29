import java.util.Scanner;

public class _2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] map = new int[15][15];
        for (int i = 0; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                if (j == 1) {
                    map[i][j] = 1;
                } else if (i == 0) {
                    map[i][j] = j; 
                } else {
                    map[i][j] = map[i-1][j] + map[i][j-1];
                }
            }
        }


        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(map[k][m]);
        }


        sc.close();
    }
}
