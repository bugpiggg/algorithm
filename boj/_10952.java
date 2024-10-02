import java.util.Scanner;

public class _10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n ==0 && m ==0) {
                break;
            }
            System.out.println(n+m);
        }


        sc.close();
    }
}
