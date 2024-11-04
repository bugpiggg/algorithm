import java.util.Scanner;

public class _2480 {
    public static void main(String[] args) {
        int[] data = new int[7];
        Scanner sc = new Scanner(System.in);

        int targetNum = -1;
        for (int i = 0; i < 3; i++) {
            int n = sc.nextInt();

            data[n] += 1;

            if (i == 0) {
                targetNum = n;
                continue;
            }

            if (data[n] > 1 || (targetNum < n && data[targetNum] != 2)) {
                targetNum = n;
            }
        }

        if (data[targetNum] == 3) {
            System.out.println(10000 + 1000*targetNum);
        } else if (data[targetNum] == 2) {
            System.out.println(1000 + 100*targetNum);
        } else {
            System.out.println(100*targetNum);
        }

        sc.close();
    }
}
