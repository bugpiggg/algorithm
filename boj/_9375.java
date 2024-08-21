
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            Map<String,Integer> map = new HashMap<>();
            for (int j = 0; j < m; j++) {
                String[] line = br.readLine().split(" ");
                if (map.containsKey(line[1])) {
                    int oldValue = map.get(line[1]);
                    map.put(line[1], ++oldValue);
                } else {
                    map.put(line[1], 1);
                }
            }

            int answer = 1;
            for (int value: map.values()) {
                answer *= (value+1);
            }
            System.out.println(answer - 1);
        }

        br.close();
    }
}
