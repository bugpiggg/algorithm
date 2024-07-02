package algorithm.boj;

import java.util.Scanner;

public class _30802 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] tSizes = new int[6];
        for (int i = 0; i < tSizes.length; i++) {
            tSizes[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int p = sc.nextInt();

        int tCount = 0;
        for (int i = 0; i < tSizes.length; i++) {
            tCount += tSizes[i] / t;
            if (tSizes[i] % t != 0) {
                tCount += 1;
            }
        }

        System.out.println(tCount);
        System.out.println(n / p + " " + n % p);
        sc.close();
    }
}
