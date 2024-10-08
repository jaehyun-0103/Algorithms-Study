import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());

        int x = (p + t) % (2 * w);
        int y = (q + t) % (2 * h);

        if (x > w) {
            x = 2 * w - x;
        }
        if (y > h) {
            y = 2 * h - y;
        }

        System.out.println(x + " " + y);
    }
}