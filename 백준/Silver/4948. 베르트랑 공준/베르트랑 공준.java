import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n;
        while (true) {
            n = Integer.parseInt(st.nextToken());
            if (n == 0)
                break;

            st = new StringTokenizer(br.readLine());

            int count = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime(i)) count++;
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
