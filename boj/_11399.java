import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(data);
        
        int current = 0;
        int[] prefixSumData = new int[n];
        for (int i = 0; i < data.length; i++) {
            prefixSumData[i] = data[i] + current;
            current += data[i];
        }

        int sum = Arrays.stream(prefixSumData).sum();
        System.out.println(sum);

        br.close();
    }
}
