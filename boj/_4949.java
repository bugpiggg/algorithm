
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            char[] lines = br.readLine().toCharArray();
            if (lines[0] == '.') {
                break;
            }
            Stack<Character> stack = new Stack<>();
            for (char c : lines) {
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else if (c == ')' || c == ']') {
                    stack.push(c);
                }
            }
            if (stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        br.close();
    }
}
