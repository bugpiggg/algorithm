import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class _1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        HashMap<String, Integer> nameToNumber = new HashMap<>();
        HashMap<Integer, String> numberToName = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            nameToNumber.put(name, i+1);
            numberToName.put(i+1, name);
        }

        for (int i = 0; i < m; i++) {
            String word = br.readLine();
            if (Character.isDigit(word.charAt(0))) {
                int number = Integer.parseInt(word);
                System.out.println(numberToName.get(number));
            } else {
                System.out.println(nameToNumber.get(word));
            }
        }

        br.close();
    }
}
