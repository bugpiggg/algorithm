import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");
            data[i][0] = Integer.parseInt(temp[0]);
            data[i][1] = Integer.parseInt(temp[1]);
        }


        String answer = "";
        for (int i = 0; i < n; i++) {
            int weight = data[i][0];
            int height = data[i][1];
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                int tw = data[j][0];
                int th = data[j][1];
                if (tw > weight && th > height) {
                    rank += 1;
                }
            }
            if (i==0) {
                answer += rank;
            } else {
                answer += " " + rank;
            }
        }
        System.out.println(answer);
        br.close();
    }
}
