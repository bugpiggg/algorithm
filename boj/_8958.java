import java.util.Scanner;

public class _8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] data = sc.nextLine().split("");
            int ans = 0;
            int prev = 0;
            for (String s: data) {
                if (s.equals("O")) {
                    prev += 1;
                    ans += prev;
                } else {
                    prev = 0;
                }
            }
            
            System.out.println(ans);
        }

        sc.close();
    }
}
