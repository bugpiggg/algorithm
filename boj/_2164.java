import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            queue.offer(i+1);
        }

        while(queue.size() > 1) {
            queue.poll();
            queue.offer(queue.poll());
        }

        System.out.println(queue.poll());

        sc.close();
    }
}
