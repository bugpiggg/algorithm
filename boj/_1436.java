import java.util.Scanner;

public class _1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        int currNum = 0;
        String answer;
        for (int i = 0; ; i++) {
            String strNum = String.valueOf(i);
            if (strNum.contains("666")) {
                currNum++;
            }
            if (currNum == n) {
                answer = strNum;
                break;
            }
        }

        System.out.println(answer);

        sc.close();
    }
}
