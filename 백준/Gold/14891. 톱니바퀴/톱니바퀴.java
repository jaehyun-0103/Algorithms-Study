import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] cogwheels = new char[4][8];
        for (int i = 0; i < 4; i++) {
            cogwheels[i] = br.readLine().toCharArray();
        }
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
                if (cogwheels[j][2] != cogwheels[j + 1][6]) {
                    rotate[j] = -rotate[j + 1];
                } else {
                    break;
                }
            }

            // 오른쪽 톱니바퀴들 확인
            for (int j = rotation + 1; j < 4; j++) {
                if (cogwheels[j][6] != cogwheels[j - 1][2]) {
                    rotate[j] = -rotate[j - 1];
                } else {
                    break;
                }
            }

            // 각 톱니바퀴 회전 수행
            for (int j = 0; j < 4; j++) {
                if (rotate[j] == 1) {
                    rotateClockwise(cogwheels[j]);
                } else if (rotate[j] == -1) {
                    rotateCounterClockwise(cogwheels[j]);
                }
            }
        }

        int score = 0;
        if (cogwheels[0][0] == '1') score += 1;
        if (cogwheels[1][0] == '1') score += 2;
        if (cogwheels[2][0] == '1') score += 4;
        if (cogwheels[3][0] == '1') score += 8;

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
}
