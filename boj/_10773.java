import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0 && !stack.isEmpty()) {
                int prev = stack.pop();
                answer -= prev;
            } else {
                answer += num;
                stack.push(num);
            }
        }

        System.out.println(answer);

        br.close();
    }
}
