import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] data = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(st1.nextToken());
        }

        int[] prefixData = new int[n];
        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixData[i] = prefixSum + data[i];
            prefixSum += data[i];
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st2.nextToken()) - 1;
            int end = Integer.parseInt(st2.nextToken()) - 1;

            if (start == 0) {
                System.out.println(prefixData[end]);
            } else {
                System.out.println(prefixData[end] - prefixData[start-1]);
            }
        }

        br.close();
    }
}
