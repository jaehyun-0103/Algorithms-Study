import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] lengths = new int[N];
        int left = 1;
        int right = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            lengths[i] = Integer.parseInt(st.nextToken());
            if (lengths[i] > right) {
                right = lengths[i];
            }
        }

        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            long total = 0;

            for (int length : lengths) {
                total += length / mid;
            }

            if (total >= M) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(result);
    }
}