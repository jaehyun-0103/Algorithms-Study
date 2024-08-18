import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            long a = Integer.parseInt(st.nextToken());
            long b = Integer.parseInt(st.nextToken());

            long originA = a;
            long originB = b;

            while (b != 0) {
                long temp = b;
                b = a % b;
                a = temp;
            }

            long lcm = (originA * originB) / a;
            sb.append(lcm).append("\n");
        }
        System.out.print(sb.toString());
    }
}
