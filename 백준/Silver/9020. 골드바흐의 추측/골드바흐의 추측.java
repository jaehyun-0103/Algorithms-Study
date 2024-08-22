import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(st.nextToken());
        int maxN = 10000;
        int n;

        boolean[] isPrime = new boolean[maxN + 1];
        for (int i = 2; i <= maxN; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= maxN; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= maxN; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());

            int prime1 = 0, prime2 = 0;
            int minDifference = Integer.MAX_VALUE;

            for (int i = 2; i <= n / 2; i++) {
                if (isPrime[i] && isPrime[n - i]) {
                    int difference = Math.abs(i - (n - i));
                    if (difference < minDifference) {
                        minDifference = difference;
                        prime1 = i;
                        prime2 = n - i;
                    }
                }
            }
            sb.append(prime1).append(" ").append(prime2).append('\n');
        }
        System.out.print(sb);
    }
}
