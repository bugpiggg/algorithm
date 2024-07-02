package algorithm.boj;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _28702 {
    public static void main(String[] args) {
        Set<String> words = new HashSet();
        words.add("Fizz");
        words.add("Buzz");
        words.add("FizzBuzz");

        Scanner sc = new Scanner(System.in);
        int maxValue = 0;
        for (int i = 0; i < 3; i++) {
            String word = sc.nextLine();
            if (!words.contains(word)) {
                maxValue = Integer.parseInt(word);
            }
            else {
                maxValue++;
            }
        }
        maxValue++;

        if (maxValue % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (maxValue % 5 == 0) {
            System.out.println("Buzz");
        } else if (maxValue % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(maxValue);
        }
        sc.close();
    }
}
