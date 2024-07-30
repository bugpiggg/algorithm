import java.util.Scanner;

public class _2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int day = (c - b) / (a - b);

        if ((c - b) % (a - b) != 0) {
            day++;
        } 

        System.out.println(day);
        sc.close();
    }
}
