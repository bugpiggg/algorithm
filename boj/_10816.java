import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class _10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
           int num = Integer.parseInt(st1.nextToken());
           if (hm.containsKey(num) == true) {
            int oldNumCount = hm.get(num);
            hm.replace(num, oldNumCount+1);
           } else {
            hm.put(num, 1);
           }
        } 


        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] answerList = new int[m];
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st2.nextToken());
            answerList[i] = hm.getOrDefault(num, 0);
        }

        String answerString = Arrays.stream(answerList)
            .mapToObj(String::valueOf)
            .collect(Collectors.joining(" "));

        System.out.println(answerString);

        br.close();
    }
}
