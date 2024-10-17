import java.util.Arrays;
import java.util.Scanner;

public class _10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        Arrays.sort(data);

        System.out.print(data[0]);
        System.out.print(" ");
        System.out.print(data[n-1]);

        sc.close();
    }
}
