import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class _11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Xy[] xy = new Xy[n];
        for (int i = 0; i < n; i++) {
            String[] lines = br.readLine().split(" ");
            xy[i] = new Xy(
                Integer.parseInt(lines[0]), Integer.parseInt(lines[1])
            );
        }

        Arrays.sort(xy, new Comparator<Xy>() {
            @Override
			public int compare(Xy xy1, Xy xy2) {
                int x_ = xy1.x - xy2.x;
                int y_ = xy1.y - xy2.y;
                if(x_ != 0) {
                    return x_;
                } else {
                    return y_;
                }
			}
        });

        for (int i = 0; i < n; i++) {
            System.out.println(xy[i]);
        }

        br.close();
    }

    static class Xy {
        int x;
        int y;

        Xy(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return x + " " + y;
        }
    }
}
