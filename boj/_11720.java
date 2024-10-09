import java.util.Scanner;

public class _11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] data = sc.nextLine().split("");

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Integer.parseInt(data[i]);
        }

        System.out.println(ans);

        sc.close();
    }
}
