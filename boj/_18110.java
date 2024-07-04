package algorithm.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(scores);
        double doubleLimit = n * 0.15;
        int limit = (int) Math.round(doubleLimit);

        int sum = 0;
        if (limit*2 >= n) {
            System.out.println(sum);
            return;
        }
        for (int i = limit; i < n-limit; i++) {
            sum += scores[i];
        }

        double result = (double) sum / (n-2*limit);
        System.out.println((int) Math.round(result));
        br.close();
    }
}
