import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] numbers;
    static int[] operators = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        numbers = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }

        calculate(numbers[0], 1);

        System.out.println(max);
        System.out.println(min);
    }

    static void calculate(int currentResult, int index) {
        if (index == N) {
            max = Math.max(max, currentResult);
            min = Math.min(min, currentResult);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;

                if (i == 0) calculate(currentResult + numbers[index], index + 1);
                else if (i == 1) calculate(currentResult - numbers[index], index + 1);
                else if (i == 2) calculate(currentResult * numbers[index], index + 1);
                else calculate(currentResult / numbers[index], index + 1);
                
                operators[i]++;
            }
        }

    }
}
