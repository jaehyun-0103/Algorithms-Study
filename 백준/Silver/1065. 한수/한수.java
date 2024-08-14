import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int cnt = 0;

        for (int i = 1; i <= X; i++) {
            if (i < 100) {
                cnt++;
            } else {
                int hundreds = i / 100;
                int tens = (i / 10) % 10;
                int ones = i % 10;

                if ((hundreds - tens) == (tens - ones)) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}