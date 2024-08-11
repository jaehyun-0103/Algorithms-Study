import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[] x = new int[N];
        int[] y = new int[N];

        for (int i = 0; i < N; i++) {
            String[] coordinates = br.readLine().split(" ");
            x[i] = Integer.parseInt(coordinates[0]);
            y[i] = Integer.parseInt(coordinates[1]);
        }

        double size;
        double maxSize = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    size = Math.abs((x[i] * (y[j] - y[k]) + x[j] * (y[k] - y[i]) + x[k] * (y[i] - y[j])) / 2.0);
                    if (size > maxSize) {
                        maxSize = size;
                    }
                }
            }
        }
        System.out.println(maxSize);
    }
}