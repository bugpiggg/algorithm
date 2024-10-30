import java.util.Scanner;

public class _1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            if (isSequence(String.valueOf(n))) {
                count++;
            }
            n--;
        }
        System.out.println(count);

        sc.close();
    }

    private static boolean isSequence(String number) {
        String[] splitedNumbers = number.split("");
        int numberCount = splitedNumbers.length;

        if (numberCount < 3) {
            return true;
        }

        int prev = Integer.parseInt(splitedNumbers[0]);
        int diff = 0;
        for (int i = 1; i < numberCount; i++) {
            int num = Integer.parseInt(splitedNumbers[i]);
            if (i == 1) {
                diff = num - prev;
            } else {
                int newDiff = num-prev;
                if(newDiff != diff) {
                    return false;
                }
            }
            prev = num;
        }

        return true;
    }
}
