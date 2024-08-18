import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int[] numbers = new int[n];

            for (int j = 0; j < n; j++) {
                numbers[j] = Integer.parseInt(st.nextToken());
            }

            long sum = 0;

            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int a = numbers[j];
                    int b = numbers[k];
                    while (b != 0) {
                        int temp = b;
                        b = a % b;
                        a = temp;
                    }
                    sum += a;
                }
            }

            System.out.println(sum);
        }
    }
}
