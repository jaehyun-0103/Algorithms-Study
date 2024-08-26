import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] sushi = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            sushi[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> sushiCount = new HashMap<>();
        int maxVariety;

        for (int i = 0; i < k; i++) {
            sushiCount.put(sushi[i], sushiCount.getOrDefault(sushi[i], 0) + 1);
        }

        maxVariety = sushiCount.size();
        if (!sushiCount.containsKey(c)) {
            maxVariety++;
        }

        for (int i = 1; i < N; i++) {
            int removeSushi = sushi[i - 1];
            sushiCount.put(removeSushi, sushiCount.get(removeSushi) - 1);
            if (sushiCount.get(removeSushi) == 0) {
                sushiCount.remove(removeSushi);
            }


            int addSushi = sushi[(i + k - 1) % N];
            sushiCount.put(addSushi, sushiCount.getOrDefault(addSushi, 0) + 1);

            int currentVariety = sushiCount.size();
            if (!sushiCount.containsKey(c)) {
                currentVariety++;
            }

            maxVariety = Math.max(maxVariety, currentVariety);
        }

        System.out.println(maxVariety);
    }
}
