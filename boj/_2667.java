
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _2667 {

    private static int[][] map;
    private static int[] dy = {1,-1,0,0};
    private static int[] dx = {0,0,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(line[j]);
            }
        }

        List<Integer> ansList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(map[i][j] == 1) {
                    int secSize = calcSecSize(i,j,n);
                    ansList.add(secSize);
                }
            }
        }

        Collections.sort(ansList);
        System.out.println(ansList.size());
        for (int i = 0; i < ansList.size(); i++) {
            System.out.println(ansList.get(i));
        }

        br.close();
    }

    private static int calcSecSize(int i_, int j_, int n) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {i_, j_});

        int size = 0;
        while(!q.isEmpty()) {
            int[] p = q.poll();
            int i = p[0];
            int j = p[1];
            if (map[i][j] == 1) {
                map[i][j] = 0;
                size++;
            } else {
                continue;
            }

            for (int k = 0; k < 4; k++) {
                int I = i + dy[k];
                int J = j + dx[k];
                if(0<=I && I<n && 0<=J && J<n && map[I][J] == 1) {
                    q.add(new int[] {I, J});
                }
            }
        }

        return size;
    }
}
