
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(br.readLine());
        }

        boolean isFail = false;
        List<String> answers = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int num = 1;
        for (int i = 0; i < n; i++) {
            int targetNum = data[i];

            if (num == targetNum) {
                answers.add("+");
                answers.add("-");
                num++;
            }
            else if (!stack.isEmpty() && targetNum == stack.peek()) {
                answers.add("-");
                stack.pop();
            } 
            else {
                if (num < targetNum) {
                    while (num <= targetNum) {
                        stack.push(num);
                        answers.add("+");
                        num++;
                    }
                    answers.add("-");
                    stack.pop();
                } else {
                    isFail = true;
                    break;
                }
            }
        }

        if(isFail == true) {
            System.out.println("NO");
        } else {
            for(String s: answers) {
                System.out.println(s);
            }
        }

        br.close();
    }
}
