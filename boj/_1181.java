package algorithm.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1181 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }

        Arrays.sort(words);
        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));

        String prevWord = "";
        for (String word : words) {
            if (!word.equals(prevWord)) {
                System.out.println(word);
            }
            prevWord = word;
        }
        br.close();
    }
}
