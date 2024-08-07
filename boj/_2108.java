
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class _2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Double sum = 0.0;
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());
            arr[i] = value;
            sum += value;
        }

        Arrays.sort(arr);

        int avg = (int) Math.round(sum / n);
        int middle = arr[(n-1)/2];
        int range = arr[n-1] - arr[0];

        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = arr[i];
            if (hm.containsKey(value)) {
                int temp = hm.get(value);
                hm.put(value, temp+1);
            } else {
                hm.put(value, 1);
            }
        }


        Set<Integer> set = hm.keySet();
        Integer[] tempArr = set.toArray(Integer[]::new);
        Arrays.sort(tempArr, (a, b) -> !Objects.equals(hm.get(a), hm.get(b)) ? hm.get(b) - hm.get(a) : a - b);

        int maxCount = hm.get(tempArr[0]);
        int mod;
        if (tempArr.length > 1 && hm.get(tempArr[1]) == maxCount) {
            mod = tempArr[1];
        } else {
            mod = tempArr[0];
        }
        System.out.println(avg);
        System.out.println(middle);
        System.out.println(mod);
        System.out.println(range);

        br.close();
    }
}
