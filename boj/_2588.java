import java.util.Scanner;

public class _2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int answer = 0;
        for (int i = 0; i < 3; i++) {
            int a = m % 10;
            int b = a * n;
            System.out.println(b);
            answer += b * Math.pow(10, i);
            m /= 10;
        }
        System.out.println(answer);

        sc.close();
    }
}
