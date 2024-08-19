
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2606 {

    public static int find(int a, int[] parent) {
        if (parent[a] == a) {
            return a;
        }
        return find(parent[a], parent);
    }

    public static int[] union(int a, int b, int[] parent) {
        int A = find(a, parent);
        int B = find(b, parent);

        if (A == B) return parent;

        if (A > B) {
            parent[A] = B;
        } else {
            parent[B] = A;
        }

        return parent;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[] parent = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken()) - 1;
            int num2 = Integer.parseInt(st.nextToken()) - 1;

            union(num1, num2, parent);
        }


        int answer = 0;
        for (int i = 1; i < n; i++) {
            if(find(i, parent) == 0) {
                answer += 1;
            } 
        }
        System.out.println(answer);

        br.close();
    }
}
