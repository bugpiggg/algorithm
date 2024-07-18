import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(arr);

        int k = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < k; i++) {
            int targetNum = Integer.parseInt(st2.nextToken());

            if (binarySearch(targetNum, arr) == true) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        br.close();
    }

    private static boolean binarySearch(int targetNumber, int[] sortedArr) {
        int startIndex = 0;
        int endIndex = sortedArr.length-1;
        boolean result = false;
        while (startIndex <= endIndex) {
            int targetIndex = (startIndex + endIndex) / 2;
            int currentNum = sortedArr[targetIndex];
            if (currentNum == targetNumber) {
                result = true;
                break;
            }

            if (sortedArr[targetIndex] > targetNumber) {
                endIndex = targetIndex - 1;
            } else {
                startIndex = targetIndex + 1;
            }
        }

        return result;
    }
}
