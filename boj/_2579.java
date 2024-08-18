import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] data = new int[n+1];
        int[] maxScoreArr = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            data[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i < n+1; i++) {
            if (i == 1) {
                maxScoreArr[i] = data[i];
            } else if (i == 2) {
                maxScoreArr[i] = maxScoreArr[i-1] + data[i];
            } else {
                maxScoreArr[i] = Math.max(maxScoreArr[i-2], maxScoreArr[i-3] + data[i-1]) + data[i];
            }
        }

        System.out.println(maxScoreArr[n]);

        br.close();
    }
}
