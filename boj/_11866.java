import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        int cursor = 0;
        int num = 1;
        int count = 0;
        int[] answer = new int[n];
        while (true) {
            if (arr[cursor] == 0) {
                cursor++;
                cursor %= n;
                continue;
            }
            if (num == k) {
                answer[count] = arr[cursor];
                arr[cursor] = 0;
                count++;
                num = 0;
            }
            cursor++;
            cursor %= n;
            num++;
            if (count == n) {
                break;
            }
        }

        String result = Arrays.stream(answer)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(", "));

        System.out.println("<" + result + ">");

        sc.close();
    }
}