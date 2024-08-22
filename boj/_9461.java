import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(getAnswer(num));
        }

        br.close();
    }

    private static long getAnswer(int num) {
        if (num <= 3) {
            return 1;
        }
        if (num <= 5) {
            return 2;
        }

        long[] data = new long[num+1];
        for (int i = 1; i < 4; i++) {
            data[i] = 1L;
        }
        for (int i = 4; i < 6; i++) {
            data[i] = 2L;
        }


        for (int i = 6; i < num+1; i++) {
            data[i] = data[i-1] + data[i-5];
        }

        return data[num];
    }
}
