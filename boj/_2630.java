
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2630 {

    private static int[][] map;
    private static int ones = 0;
    private static int zeros = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(line[j]);
            }
        }

        calc(n, 0, 0);

        System.out.println(zeros);
        System.out.println(ones);

        br.close();
    }

    private static void calc(int n, int x, int y) {
        if (checkColor(n, x, y)) {
            int firstElement = map[x][y];
            if (firstElement == 1) {
                ones++;
            } else {
                zeros++;
            }
            return;
        }

        calc(n/2, x, y);
        calc(n/2, x+n/2, y);
        calc(n/2, x, y+n/2);
        calc(n/2, x+n/2, y+n/2);
    }

    private static boolean checkColor(int n, int x, int y) {
        int firstElement = map[x][y];
        for (int i = x; i < x+n; i++) {
            for (int j = y; j < y+n; j++) {
                if (map[i][j] != firstElement) {
                    return false;
                }     
            }
        }
        return true;
    }
}
