import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int max = -1;
        int min = Integer.MAX_VALUE;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                int num = Integer.parseInt(line[j]);
                if (map.containsKey(num)) {
                    int prevCount = map.get(num);
                    map.put(num, prevCount+1);
                } else {
                    map.put(num, 1);
                }

                if (num > max) {
                    max = num;
                }
                if(num < min) {
                    min = num;
                }
            }
        }

        int i = Integer.MAX_VALUE;
        int j = -1;

        for(int key = min; key <= max; key++) {
            int i_ = 0;
            int b_ = b;
            for (int key_ : map.keySet()) {
                int diff = key - key_;
                if (diff > 0) {
                    i_ += diff * map.get(key_);
                    b_ -= diff * map.get(key_);
                } else if (diff < 0) {
                    i_ -= diff * 2 * map.get(key_);
                    b_ -= diff * map.get(key_);
                }
            }
            if (b_ >= 0 && i_ <= i && j <= key) {
                i = i_;
                j = key;
            }
        }

        System.out.println(i + " " + j);

        br.close();
    }
}
