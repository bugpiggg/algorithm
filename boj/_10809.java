import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] data = br.readLine().toCharArray();
        int[] alph = new int[26];
        for (int i = 0; i < 26; i++) {
            alph[i] = -1;
        }
        for (int j = 0; j < data.length; j++) {
           int i = data[j] - 'a';
           if (alph[i] == -1) {
               alph[i] = j;
           }
        }
        
        for (int i = 0; i < 26; i++) {
           System.out.print(alph[i]);
           if (i < 25) {
               System.out.print(' ');
           }
        }

        br.close();
    }
}
