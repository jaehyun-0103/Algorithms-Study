import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int OneCnt = 0;
        int ZeroCnt = 0;

        if (S.charAt(0) == '1') {
            OneCnt++;
        } else {
            ZeroCnt++;
        }

        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                if (S.charAt(i + 1) == '1')
                    OneCnt++;
                else
                    ZeroCnt++;
            }
        }

        System.out.println(Math.min(OneCnt, ZeroCnt));
    }
}