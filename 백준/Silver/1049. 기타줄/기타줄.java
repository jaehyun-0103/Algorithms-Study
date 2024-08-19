import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] packagePrice = new int[M];
        int[] singlePrice = new int[M];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            packagePrice[i] = Integer.parseInt(st.nextToken());
            singlePrice[i] = Integer.parseInt(st.nextToken());
        }

        int minPackagePrice = packagePrice[0];
        int minSinglePrice = singlePrice[0];

        for (int i = 1; i < M; i++) {
            if (packagePrice[i] < minPackagePrice) {
                minPackagePrice = packagePrice[i];
            }
            if (singlePrice[i] < minSinglePrice) {
                minSinglePrice = singlePrice[i];
            }
        }

        int cost1 = (N / 6) * minPackagePrice + (N % 6) * minSinglePrice;
        int cost2 = ((N / 6) + 1) * minPackagePrice;
        int cost3 = N * minSinglePrice;
        
        int minCost = Math.min(cost1, Math.min(cost2, cost3));

        System.out.println(minCost);

    }
}
