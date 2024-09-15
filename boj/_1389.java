import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1389 {

    private static int MAX_VALUE = 200000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    map[i][j] = 0;
                } else {
                    map[i][j] = MAX_VALUE;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken()) - 1;
            int b = Integer.parseInt(st1.nextToken()) - 1;
            map[a][b] = map[b][a] = 1;
        }

        for (int k = 0; k < n; k++) {
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < n; i++) {
                    if (map[j][i] > map[j][k] + map[k][i]) {
                        map[j][i] = map[j][k] + map[k][i];
                    }
                }
            }
        }

        int res = MAX_VALUE;
        int resIndex = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += map[i][j];
            }

            if (res > sum) {
                res = sum;
                resIndex = i;
            }
        }

        System.out.println(resIndex+1);

        br.close();
    }
}
