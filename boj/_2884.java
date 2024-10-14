import java.util.Scanner;

public class _2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        int newH = h, newM = m;
        if (m >= 45) {
            newM = m - 45;
        } else {
            newM = 15 + m;
            newH = h - 1;
            if (newH < 0) {
                newH = 23;
            }
        }

        System.out.println(newH + " " + newM);

        sc.close();
    }
}
