import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        char[] balls = st.nextToken().toCharArray();

        int redCnt = 0;
        int blueCnt = 0;

        for (int i = 0; i < N; i++) {
            if (balls[i] == 'R') {
                redCnt += 1;
            }
            if (balls[i] == 'B') {
                blueCnt += 1;
            }
        }

        int firstBallCnt = 0;
        for (int i = 0; i < N; i++) {
            if (balls[i] == 'R') {
                firstBallCnt += 1;
            } else {
                break;
            }
        }
        int answer = redCnt - firstBallCnt;

        firstBallCnt = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (balls[i] == 'R') {
                firstBallCnt += 1;
            } else {
                break;
            }
        }
        answer = Math.min(answer, redCnt - firstBallCnt);

        firstBallCnt = 0;
        for (int i = 0; i < N; i++) {
            if (balls[i] == 'B') {
                firstBallCnt += 1;
            } else {
                break;
            }
        }
        answer = Math.min(answer, blueCnt - firstBallCnt);

        firstBallCnt = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (balls[i] == 'B') {
                firstBallCnt += 1;
            } else {
                break;
            }
        }
        answer = Math.min(answer, blueCnt - firstBallCnt);

        System.out.println(answer);
    }
}
