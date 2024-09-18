import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            data[i] = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        }

        int[][] sortedData = Arrays.stream(data)
            .sorted((a,b) -> {
                if(a[1] == b[1]) {
                    return a[0] - b[0];
                }

                return a[1] - b[1];
            })
            .toArray(int[][]::new)
            ;

        int[] latestMeeting = sortedData[0];
        int answer = 1;
        int index = 1;
        while(index < n) {
            int[] curr = sortedData[index];
            int startCurrTime = curr[0];
            int latestEndTime = latestMeeting[1];

            if(latestEndTime <= startCurrTime) {
                latestMeeting = curr;
                answer++;
            }

            index++;
        }

        System.out.println(answer);

        br.close();
    }
}
