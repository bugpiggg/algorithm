import java.util.Scanner;

public class _10886 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int isCute = 0, isNotCute = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                isNotCute++;
            } else {
                isCute++;
            }
        }

        if(isCute > isNotCute) {
            System.out.println("Junhee is cute!");
        } else {
            System.out.println("Junhee is not cute!");
        }

        sc.close();
    }
}
