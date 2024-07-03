package algorithm.boj;

import java.util.Scanner;

public class _4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a+b+c == 0) {
                break;
            }

            int max = 0;
            int squareSum = 0;
            if (max < a) {
                max = a;
                squareSum = b*b + c*c;
            }
            if (max < b) {
                max = b;
                squareSum = a*a + c*c;
            }
            if (max < c) {
                max = c;
                squareSum = b*b + a*a;
            }

            if (squareSum == max*max) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
        sc.close();
    }
}
