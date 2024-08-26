import java.util.Scanner;

public class _17626 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] data = new int[50001];
        data[1] = 1;

        for (int i = 2; i <= n ; i++) {
            data[i] = data[i-1] + 1;
            for (int j = 1; j * j <= i ; j++) {
                data[i] = Math.min(data[i], data[i - j*j] + 1);
            }            
        }

        System.out.println(data[n]);

        sc.close();
    }
}
