import java.util.Scanner;

public class _2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            ans += num * num;
        }

        System.out.println(ans%10);

        sc.close();
    }  
}
