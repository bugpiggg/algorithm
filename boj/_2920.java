import java.util.Scanner;

public class _2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inputs = new int[8];
        for (int i = 0; i < 8; i++) {
            inputs[i] = sc.nextInt();
        }

        String answer;
        for (int i = 0; i < 8-1; i++) {
            if (inputs[i] == inputs[i+1] - 1) {
                answer = "ascending";
            } else if (inputs[i] == inputs[i+1]+1) {
                answer = "descending";
            } else {
                answer = "mixed";
                break;
            }
        }
        System.out.println(answer);

        sc.close();
    }
}
