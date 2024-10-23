import java.util.Scanner;

public class _3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;
        int[] data = new int[42];
        for (int i = 0; i < 10; i++) {
            int div = sc.nextInt() % 42;
            if (data[div] == 0) {
                ans++;
                data[div] = 1;
            } 
        }

        System.out.println(ans);

        sc.close();
    }
}
