package algorithm.boj;

import java.util.Scanner;

public class _2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        int minNum;
        if (n > m) {
            minNum = n;
        } else {
            minNum = m;
        }

        int gcd = 0;
        for (int i = 1; i <= minNum; i++) {
            if (n % i ==0 && m % i  == 0) {
                gcd = i;
            }
        }

        int lcm = gcd * (n / gcd) * (m / gcd);

        System.out.println(gcd);
        System.out.println(lcm);

        sc.close();
    }
}
