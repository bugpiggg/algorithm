import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split("-");

        int answer = 0;
        for (int i = 0; i < line.length; i++) {
            String[] words = line[i].split("\\+");

            int sum = 0;
            for (String e: words) {
                sum += Integer.parseInt(e);
            }

            if (i == 0) {
                answer += sum;
            } else {
                answer -= sum;
            }
        }

        System.out.println(answer);

        br.close();
    }
}
