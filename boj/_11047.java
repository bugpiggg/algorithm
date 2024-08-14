import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);

        int[] coins = new int[n];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int now = k;
        int answer = 0;
        while(now != 0) {
            for (int i = n-1; i >= 0; i--) {
                if(now >= coins[i]) {
                    answer += (now / coins[i]);
                    now %= coins[i];
                    if (now < coins[0] && now !=0) {
                        answer = 0;
                        now = k;
                    }
                }
            }
        }
        System.out.println(answer);


        br.close();
    }
}
