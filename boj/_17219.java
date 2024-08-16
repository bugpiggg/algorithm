
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class _17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        HashMap<String, String> passwordMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line_ = br.readLine().split(" ");
            passwordMap.put(line_[0], line_[1]);
        }

        for (int i = 0; i < m; i++) {
            String line__ = br.readLine();
            System.out.println(passwordMap.get(line__));
        }

        br.close();
    }
}
