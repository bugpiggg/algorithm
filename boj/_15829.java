package algorithm.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] string = br.readLine().toCharArray();

        long sum = 0;
        long r = 1;
        for (int i = 0; i < n; i++) {
            long result = (string[i] - 'a' + 1) * r;
            sum += result;
            r = (r * 31) % 1234567891;
        }

        System.out.println(sum % 1234567891);
        br.close();
    }
}
