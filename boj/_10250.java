import java.util.Scanner;
import java.util.StringTokenizer;

public class _10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int nn = Integer.parseInt(st.nextToken());

            int height = nn % h;
            if (height == 0) {
                height = h;
            }
            int width = (nn / h) + 1;
            if (height == h) {
                width -= 1;
            }

            System.out.println(height + String.format("%02d", width));
        }

        sc.close();
    }
}
