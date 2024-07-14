package algorithm.boj;

import java.util.Scanner;

public class _11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] cache = new int[n+1][m+1];

        for (int i = 0; i < n+1; i++) {
            cache[i][0] = 1;
        }
        for (int i = 0; i < m+1; i++) {
            cache[i][i] = 1;
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                cache[i][j] = cache[i-1][j] + cache[i-1][j-1];
            }
        }
        System.out.println(cache[n][m]);
        sc.close();
    }
}
