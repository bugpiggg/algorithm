import java.util.Scanner;

public class _11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] data = new int[1001];
        data[1] = 1;
        data[2] = 3;
        for (int i = 3; i < n+1; i++) {
            data[i] = (data[i-2]*2 + data[i-1]) % 10007;
        }

        System.out.println(data[n]);

        sc.close();
    }
}
