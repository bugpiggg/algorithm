
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        int[] data = new int[n];
        int max = -1;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(st.nextToken());
            if (data[i] > max) {
                max = data[i];
            }
        }

        int left = 0;
        int right = max;
        while (left <= right) {
            int mid= (left+right)/2;
            long temp =0;
            for (int i = 0; i < n; i++) {
                if (data[i] > mid) {
                    temp += data[i] - mid;
                }
            }
            if (temp >= m) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        System.out.println(right);

        br.close();
    }
}
