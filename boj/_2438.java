import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < i; j++) {
                sb.append('*');
            }
            System.out.println(sb);
        }
        br.close();
    }
}
