import java.util.Scanner;

public class _2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer = 0;
        int sum = 1;
        while(n > sum) {
            sum += 6 * ++answer;
        }

        System.out.println(answer+1);


        sc.close();
    }
}
