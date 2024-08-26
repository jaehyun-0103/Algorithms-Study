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
        String[] words = new String[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            words[i] = st.nextToken();
        }
        int[] weights = new int[26];

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int weight = (int) Math.pow(10, word.length() - i - 1);

                weights[c - 'A'] += weight;
            }
        }

        Arrays.sort(weights);

        int result = 0;
        int num = 9;
        for (int i = 25; i >= 0; i--) {
            if (weights[i] == 0) {
                break;
            }
            result += weights[i] * num;
            num--;
        }

        System.out.println(result);
    }
}
