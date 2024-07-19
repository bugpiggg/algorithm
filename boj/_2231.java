import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2231 {
    public static int create(int num) {
        int tmp = num;
        int ans = num;
        while(tmp != 0) {
            ans += tmp%10;
            tmp /= 10;
        }
        return ans;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < 1000000; i++) {
            if(create(i) == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
        br.close();
    }
}
