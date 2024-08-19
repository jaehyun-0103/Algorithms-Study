import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] ropes = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            ropes[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(ropes);

        int maxWeight = 0;

        for (int i = 0; i < N; i++) {
            int weight = ropes[i] * (N - i);
            maxWeight = Math.max(maxWeight, weight);
        }

        System.out.println(maxWeight);
    }
}
