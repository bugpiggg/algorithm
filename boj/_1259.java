package algorithm.boj;

import java.util.Scanner;

public class _1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String text = sc.nextLine();

            if (text.equals("0")) {
                break;
            }

            int n = text.length();
            boolean isPalindrome = true;
            char[] textArray = text.toCharArray();
            for (int i = 0; i < n/2; i++) {
                if (textArray[i] != textArray[n-i-1]) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        sc.close();
    }
}
