import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int N = Integer.parseInt(st.nextToken());
        int num;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            num = Integer.parseInt(st.nextToken());

            if (num > 0)
                maxHeap.add(num);
            else {
                if (maxHeap.isEmpty())
                    sb.append(0).append("\n");
                else
                    sb.append(maxHeap.poll()).append("\n");
            }
        }

        System.out.println(sb);
    }
}
