import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] cogwheelOne = br.readLine().toCharArray();
        char[] cogwheelTwo = br.readLine().toCharArray();
        char[] cogwheelThree = br.readLine().toCharArray();
        char[] cogwheelFour = br.readLine().toCharArray();
        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int rotation = Integer.parseInt(st.nextToken()) - 1;
            int direction = Integer.parseInt(st.nextToken());

            // 각 톱니바퀴의 회전 방향을 저장할 배열
            int[] rotate = new int[4];
            rotate[rotation] = direction;

            // 왼쪽 톱니바퀴들 확인
            for (int j = rotation - 1; j >= 0; j--) {
                if (getTooth(j, j + 1, cogwheelOne, cogwheelTwo, cogwheelThree, cogwheelFour) !=
                        getTooth(j + 1, j, cogwheelOne, cogwheelTwo, cogwheelThree, cogwheelFour)) {
                    rotate[j] = -rotate[j + 1];
                } else {
                    break;
                }
            }

            // 오른쪽 톱니바퀴들 확인
            for (int j = rotation + 1; j < 4; j++) {
                if (getTooth(j, j - 1, cogwheelOne, cogwheelTwo, cogwheelThree, cogwheelFour) !=
                        getTooth(j - 1, j, cogwheelOne, cogwheelTwo, cogwheelThree, cogwheelFour)) {
                    rotate[j] = -rotate[j - 1];
                } else {
                    break;
                }
            }

            // 각 톱니바퀴 회전 수행
            if (rotate[0] == 1) rotateClockwise(cogwheelOne);
            else if (rotate[0] == -1) rotateCounterClockwise(cogwheelOne);

            if (rotate[1] == 1) rotateClockwise(cogwheelTwo);
            else if (rotate[1] == -1) rotateCounterClockwise(cogwheelTwo);

            if (rotate[2] == 1) rotateClockwise(cogwheelThree);
            else if (rotate[2] == -1) rotateCounterClockwise(cogwheelThree);

            if (rotate[3] == 1) rotateClockwise(cogwheelFour);
            else if (rotate[3] == -1) rotateCounterClockwise(cogwheelFour);
        }

        int score = 0;
        if (cogwheelOne[0] == '1') score += 1;
        if (cogwheelTwo[0] == '1') score += 2;
        if (cogwheelThree[0] == '1') score += 4;
        if (cogwheelFour[0] == '1') score += 8;

        System.out.println(score);
    }

    // 시계 방향 회전
    public static void rotateClockwise(char[] cogwheel) {
        char temp = cogwheel[7];
        for (int i = 7; i > 0; i--) {
            cogwheel[i] = cogwheel[i - 1];
        }
        cogwheel[0] = temp;
    }

    // 반시계 방향 회전
    public static void rotateCounterClockwise(char[] cogwheel) {
        char temp = cogwheel[0];
        for (int i = 0; i < 7; i++) {
            cogwheel[i] = cogwheel[i + 1];
        }
        cogwheel[7] = temp;
    }

    // 톱니바퀴의 특정 위치의 값 로드
    public static char getTooth(int from, int to, char[] cogwheelOne, char[] cogwheelTwo, char[] cogwheelThree, char[] cogwheelFour) {
        if (from == 0) return cogwheelOne[(to == 1 ? 2 : 6)];
        else if (from == 1) return cogwheelTwo[(to == 0 ? 6 : 2)];
        else if (from == 2) return cogwheelThree[(to == 1 ? 6 : 2)];
        else return cogwheelFour[(to == 2 ? 6 : 2)];
    }
}
