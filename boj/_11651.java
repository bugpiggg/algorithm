import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            nums[i][0] = x;
            nums[i][1] = y;
        }

        Arrays.sort(nums, (a, b) -> {
            int result = Integer.compare(a[1], b[1]);
            if (result == 0) {
                result = Integer.compare(a[0], b[0]);
            }
            return result;
        });

        for (int i = 0; i < n; i++) {
            int x = nums[i][0];
            int y = nums[i][1];
            System.out.println(x + " " + y);
        }

        br.close();
    }
}
