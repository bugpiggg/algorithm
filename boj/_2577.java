import java.util.Scanner;

public class _2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans = a * b * c;
        int[] cnt = new int[10];
        while(true) {
            int mod = ans / 10;
            int div = ans % 10;

            int prev = cnt[div];
            cnt[div] = prev + 1;

            ans = mod;

            if (mod == 0) {
                break;
            }
        }

        for(int cc:cnt) {
            System.out.println(cc);
        }

        sc.close();
    }
}
