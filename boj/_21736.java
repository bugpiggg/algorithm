
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _21736 {
    private static int[] dx = {1,-1,0,0};
    private static int[] dy = {0,0,1,-1};
    private static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] currentPos = new int[2];
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            char[] tempLine = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                char word = tempLine[j];
                if (word == 'X') {
                    map[i][j] = 1;
                } else if (word == 'I') {
                    currentPos[0] = i;
                    currentPos[1] = j;
                } else if (word == 'P') {
                    map[i][j] = 2;
                }
            }
        }

        int ans = bfs(currentPos, n, m);

        if (ans == 0) {
            System.out.println("TT");
        } else {
            System.out.println(ans);
        }

        br.close();
    }

    private static int bfs(int[] pos, int n, int m) {
        Queue<int[]> pq = new LinkedList<>();
        pq.add(pos);

        int count = 0;
        while(!pq.isEmpty()) {
            int[] pop = pq.poll();
            int X = pop[0];
            int Y = pop[1];

            for (int i = 0; i < 4; i++) {
                int x = X + dx[i];
                int y = Y + dy[i];
                if (0 <= x && x < n && 0 <= y && y < m && map[x][y] != 1) {
                    if (map[x][y] == 2) {
                        count += 1;
                    }
                    map[x][y] = 1;
                    pq.add(new int[] {x, y});
                }
            }
        }

        return count;
    }
}
