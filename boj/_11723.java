
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int bitset = 0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] cmd = br.readLine().split(" ");
            String c1 = cmd[0];
            if ("add".equals(c1)) {
                int num = Integer.parseInt(cmd[1]);
                bitset |= 1 << (num - 1);
            }
            if ("remove".equals(c1)) {
                int num = Integer.parseInt(cmd[1]);
                bitset &= ~(1 << (num - 1));
            }
            if ("check".equals(c1)) {
                int num = Integer.parseInt(cmd[1]);
                if((bitset & (1 << (num - 1))) != 0) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            }
            if ("toggle".equals(c1)) {
                int num = Integer.parseInt(cmd[1]);
                bitset ^= 1 << (num - 1);
            }
            if ("all".equals(c1)) {
                bitset |= (~0);
            }
            if ("empty".equals(c1)) {
                bitset &= 0;
            }
        }

        bw.write(
            sb.toString()
        );

        bw.close();
        br.close();
    }
}
