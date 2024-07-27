import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // PriorityQueue<Integer> pq = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());
        int[] dict = new int[10001];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            dict[num] += 1;
        }

        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (dict[i] > 0) {
                for (int j = 0; j < dict[i]; j++) {
                    sb.append(i).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
