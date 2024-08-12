import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] row =new int[N];
        ArrayList<Integer> result = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            row[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = N; i >= 1; i--) {
            result.add(row[i - 1], i);
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}