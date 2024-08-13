import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class _1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int n  = Integer.parseInt(line[0]);
        int m  = Integer.parseInt(line[1]);
        
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String word = br.readLine();
            if (set.contains(word)) {
                arr.add(word);
            }
        }

        Collections.sort(arr);

        System.out.println(arr.size());
        for (String word: arr) {
            System.out.println(word);
        }

        br.close();
    }
}
