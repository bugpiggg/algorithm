
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1012 {

    private static final int[] dx = { 1 ,-1, 0, 0 };
    private static final int[] dy = { 0 , 0, 1, -1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[][] map = new int[n][m];
            for (int j = 0; j < k; j++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st2.nextToken());
                int y = Integer.parseInt(st2.nextToken());
                map[y][x] = 1;
            }

            int answer = 0;
            for (int y = 0; y < n; y++) {
                for (int x = 0; x < m; x++) {
                    if (map[y][x] == 1) {
                        countAndFillCabbagePlace(map, y, x);
                        answer += 1;
                    }
                }
            }

            System.out.println(answer);

        }

        br.close();
    }

    private static void countAndFillCabbagePlace(int[][] map, int Y, int X) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { Y, X });

        int n = map.length;
        int m = map[0].length;
        while(!queue.isEmpty()) {
            int[] e = queue.poll();
            int y = e[0];
            int x = e[1];
            if (map[y][x] == 0) {
                continue;
            }

            map[y][x] = 0;

            for (int i = 0; i < 4; i++) {
                int yy = y + dy[i];                
                int xx = x + dx[i];                
                if (0 <= yy && yy < n && 0<= xx && xx < m && map[yy][xx] == 1) {
                    queue.add(new int[] { yy, xx });
                }
            }
        }
    }
}
