import java.util.Scanner;

public class _1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (b >= c) {
            System.out.println(-1);
        } else {
            int d = c -b;
            int e = a / d;
            System.out.println(e + 1);            
        }

        sc.close();
    }
}
