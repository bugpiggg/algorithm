
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        int k = Integer.parseInt(nm[0]);
        int n = Integer.parseInt(nm[1]);

        int[] lines = new int[k];
        long max = 0;
        for (int i = 0; i < k; i++) {
            lines[i] = Integer.parseInt(br.readLine());
            if (lines[i] > max) {
                max = lines[i];
            }
        }

        max++;

        long min = 0;
        long mid = 0;

        while (min < max) {
            mid = (min + max) / 2;

            long count = 0;

            for (int i = 0; i < k; i++) {
                count += lines[i] / mid;
            }

            if (count < n) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(min - 1);

        br.close();
    }
}
