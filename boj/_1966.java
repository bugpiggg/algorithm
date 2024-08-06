
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            int count = Integer.parseInt(st1.nextToken());
            int targetIndex = Integer.parseInt(st1.nextToken());

            Queue<Integer> queue = new LinkedList<>();
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < count; j++) {
                int num = Integer.parseInt(st2.nextToken());
                queue.add(num);
            }

            int answer = 1;
            while(true) {
                int max = Collections.max(queue);

                if (queue.peek() == max) {
                    queue.poll();
                    if (targetIndex == 0) {
                        break;
                    } else {
                        answer += 1;
                    }
                } else {
                    int temp = queue.poll();
                    queue.add(temp);
                }

                targetIndex -= 1;
                if (targetIndex < 0) {
                    targetIndex = queue.size() - 1;
                }
            }

            System.out.println(answer);
        }

        br.close();
    }
}
