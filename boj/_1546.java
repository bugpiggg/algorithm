package algorithm.boj;

import java.util.Arrays;
import java.util.Scanner;

public class _1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int maxNum = Arrays.stream(numbers).max().getAsInt();
        int sum = Arrays.stream(numbers).sum();
        
        double result = (double) sum * 100 / maxNum;
        
        System.out.println(result/n);

        sc.close();
    }
}
