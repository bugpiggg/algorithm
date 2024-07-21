import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            boolean result = isVPS(br.readLine());
            if (result) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        br.close();
    }

    private static boolean isVPS(String word) {
        char[] charArr = word.toCharArray();
        Stack<Character> stack = new Stack<>(); 
        for (char ch : charArr) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if(stack.size() > 0 && stack.lastElement() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        return stack.isEmpty();
    }
}