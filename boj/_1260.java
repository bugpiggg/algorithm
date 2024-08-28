
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1260 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int[] check = new int[n+1];
        int[][] map = new int[n+1][n+1];
        for (int i = 0; i < m; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());

            map[a][b] = 1;
            map[b][a] = 1;
        }

        dfs(n, map, v, check);
        System.out.println();
        check = new int[n+1];
        bfs(n, map, v, check);

        br.close();
    }

    private static void dfs(int n, int[][] map, int startPoint, int[] check) {
        check[startPoint] = 1;
        System.out.print(startPoint + " ");
        for (int i = 0; i <= n; i++) {
            if (map[startPoint][i] == 1 && check[i] == 0) {
                dfs(n, map, i, check);
            }
        }
    }

    private static void bfs(int n, int[][] map, int startPoint, int[] check) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startPoint);
        check[startPoint] = 1;

        while(!queue.isEmpty()) {
            startPoint = queue.poll();
            System.out.print(startPoint + " ");

            for (int i = 0; i <= n; i++) {
                if (map[startPoint][i] == 1 && check[i] == 0) {
                    queue.add(i);
                    check[i] = 1;
                }
            }
        }
    }
}
