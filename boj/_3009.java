import java.util.Scanner;

public class _3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[1001];
        int[] y = new int[1001];

        for (int i = 0; i < 3; i++) {
            int xx = sc.nextInt();
            int yy = sc.nextInt();
            x[xx]++;
            y[yy]++;
        }

        for (int i = 1; i < 1001; i++) {
            if (x[i] == 1) {
                System.out.print(i);
            }
        }
        System.out.print(" ");
        for (int i = 1; i < 1001; i++) {
            if (y[i] == 1) {
                System.out.print(i);
            }
        }

        sc.close();
    }
}
