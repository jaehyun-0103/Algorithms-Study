import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> compare = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            compare.add(Integer.parseInt(st.nextToken()));
        }

        int total = 0;
        while (compare.size() > 1) {
            int first = compare.poll();
            int second = compare.poll();

            int add = first + second;
            total += add;

            compare.add(add);
        }

        System.out.println(total);
    }
}
