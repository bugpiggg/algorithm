import java.util.Scanner;

public class _2562 {
    public static void main(String[] args) {
        int n = 9;
        Scanner sc = new Scanner(System.in);

        int ans = 0;
        int ansIndex = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (i==0) {
                ans = num;
                ansIndex = i;
            } else if (ans < num) {
                ans = num;
                ansIndex = i;
            }
        }

        System.out.println(ans);
        System.out.println(ansIndex+1);
        sc.close();
    }
}
