package algorithm.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        char[][] mapp = new char[n][m];
        for (int i = 0; i < n; i++) {
            char[] line = br.readLine().toCharArray();
            System.arraycopy(line, 0, mapp[i], 0, m);
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < n-7; i++) {
            for (int j = 0; j < m - 7; j++) {
                int countW = checkIsChessBoardAndReturnIncorrectCount(
                    mapp,
                    true,
                    i,
                    j
                );

                if (answer > countW) {
                    answer = countW;
                }

                int countB = checkIsChessBoardAndReturnIncorrectCount(
                    mapp,
                    false,
                    i,
                    j
                );

                if (answer > countB) {
                    answer = countB;
                }
            }
        }
        System.out.println(answer);
        br.close();
    }

    private static int checkIsChessBoardAndReturnIncorrectCount(
        char[][] mapp,
        boolean whiteStart,
        int startN,
        int startM
    ) {
        int count = 0;
        for (int i = startN; i < startN + 8; i++) {
            char expectedChar = 'B';
            if (whiteStart) {
                expectedChar = 'W';
            } 
            for (int j = startM; j < startM + 8; j++) {
                if (expectedChar != mapp[i][j]) {
                    count += 1;
                }

                if (expectedChar == 'W') {
                    expectedChar = 'B';
                } else {
                    expectedChar = 'W';
                }
            }
            whiteStart = !whiteStart;
        }
        return count;
    }
}
