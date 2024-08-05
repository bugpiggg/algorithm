import java.util.Scanner;

public class _1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] data = new int[n+1];
        data[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (data[i] == 0) {
                int temp = i * 2;
                while(temp <= n) {
                    data[temp] = 1;
                    temp += i;
                }
            }
        }

        for (int i = m; i <= n; i++) {
            if (data[i] == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
