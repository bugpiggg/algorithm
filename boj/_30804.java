
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _30804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] data = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        int left = 0;
        Map<Integer, Integer> mapp = new HashMap<>();
        for (int right = 0; right < data.length; right++) {
            int num = data[right];
            mapp.put(num, mapp.getOrDefault(num, 0)+1);

            while(mapp.keySet().size() > 2) {
                int num_ = data[left];
                int count = mapp.get(num_)-1;
                mapp.put(num_, count);
                if (count == 0) {
                    mapp.remove(num_);
                }
                left++;
            }

            ans = Math.max(ans, right-left+1);
        }

        System.out.println(ans);


        br.close();
    }
}
