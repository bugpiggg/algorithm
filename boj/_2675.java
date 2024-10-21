import java.util.Scanner;

public class _2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] s = sc.nextLine().split(" ");
            int num = Integer.parseInt(s[0]);
            String[] strr = s[1].split("");
            for(String ss: strr) {
                for (int j = 0; j < num; j++) {
                    System.out.print(ss);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
