import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] data = new int[n];
        int[] copyData = new int[n];
        String[] line = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            data[i] = copyData[i] =  Integer.parseInt(line[i]);
        }

        Arrays.sort(copyData);

        Map<Integer,Integer> mapData = new HashMap<>();
        int i = 0;
        for(int v: copyData) {
            if(!mapData.containsKey(v)) {
                mapData.put(v, i);
                i++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n; j++) {
            int num = data[j];
            sb.append(mapData.get(num)).append(' ');
        }

        System.out.println(sb);

        br.close();
    }
}
