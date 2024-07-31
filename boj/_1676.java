import java.util.Scanner;

public class _1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int _5 = n / 5;
        int _25 = n / 25;
        int _125 = n / 125;

        System.out.println(_5 + _25 + _125);

        sc.close();
    }
}
