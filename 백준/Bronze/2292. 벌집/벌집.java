import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int room = 1;
        int m = 1;
        int num = Integer.parseInt(st.nextToken());

        while (room < num) {
            room += 6 * m;
            m++;
        }

        System.out.println(m);

    }
}