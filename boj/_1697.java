
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _1697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        if (n >= m) {
            System.out.println(n-m);
        } else {
            int[] data = new int[100001];

            for (int i = 0; i < 100001; i++) {
                data[i] = 100001;
            }

            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[] {n, 0});

            while(!queue.isEmpty()) {
                int[] nn = queue.poll();

                int index = nn[0];
                int cnt = nn[1];

                if (data[index] > cnt) {
                    data[index] = cnt;
                }

                int[] nextIndex = {index-1, index+1, index*2};

                for(int nextIdx: nextIndex) {
                    if (nextIdx >= 0 && nextIdx <= 100000 && data[nextIdx] > cnt + 1) {
                        queue.add(new int[] { nextIdx, cnt + 1 });
                    } 
                }
            }
            System.out.println(data[m]);
        }

        br.close();
    }
}
