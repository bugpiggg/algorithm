import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        int[] zeros = new int[41];
        int[] ones = new int[41];

        zeros[0] = 1;
        ones[1] = 1;

        for (int i = 2; i < 41; i++) {
            zeros[i] = zeros[i-2] + zeros[i-1];
            ones[i] = ones[i-2] + ones[i-1];
        }

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(zeros[n] + " " + ones[n]);
        }

        br.close();
    }
}
