import java.util.Scanner;

public class _31403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();

        System.out.println(Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c));
        System.out.println(Integer.parseInt(a.concat(b)) - Integer.parseInt(c));

        sc.close();
    }
}
