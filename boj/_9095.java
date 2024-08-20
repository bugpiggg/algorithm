import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        int[] data = new int[12];
        data[1] = 1;
        data[2] = 2;
        data[3] = 4;
        for (int i = 4; i < 12; i++) {
            data[i] = data[i-3] + data[i-2] + data[i-1];
        }

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(data[num]);
        }

        br.close();
    }
}
