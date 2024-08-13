import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int[] XPoint = new int[P];
        int[] YPoint = new int[P];

        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());
            XPoint[i] = Integer.parseInt(st.nextToken());
            YPoint[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int i = 0; i < P; i++) {
            if (XPoint[i] >= X && YPoint[i] >= Y && XPoint[i] <= X + W && YPoint[i] <= Y + H)
                cnt++;
            else if (Math.pow(XPoint[i] - X, 2) + Math.pow(YPoint[i] - (Y + H / 2), 2) <= Math.pow(H / 2, 2))
                cnt++;
            else if (Math.pow(XPoint[i] - (X + W), 2) + Math.pow(YPoint[i] - (Y + H / 2), 2) <= Math.pow(H / 2, 2))
                cnt++;

        }
        System.out.println(cnt);
    }
}