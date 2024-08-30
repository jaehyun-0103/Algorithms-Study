import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M, x, y, K;
    static int[][] map;
    static int[] dice = new int[6];
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; i++) {
            int order = Integer.parseInt(st.nextToken()) - 1;

            dicing(order);
        }
    }

    public static void dicing(int direction) {
        int nx = x + dx[direction];
        int ny = y + dy[direction];

        if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
            return;
        }

        x = nx;
        y = ny;

        int[] newDice = dice.clone();
        if (direction == 0) {
            dice[0] = newDice[3];
            dice[2] = newDice[0];
            dice[3] = newDice[5];
            dice[5] = newDice[2];
        } else if (direction == 1) {
            dice[0] = newDice[2];
            dice[2] = newDice[5];
            dice[3] = newDice[0];
            dice[5] = newDice[3];
        } else if (direction == 2) {
            dice[0] = newDice[4];
            dice[1] = newDice[0];
            dice[4] = newDice[5];
            dice[5] = newDice[1];
        } else if (direction == 3) {
            dice[0] = newDice[1];
            dice[1] = newDice[5];
            dice[4] = newDice[0];
            dice[5] = newDice[4];
        }

        if (map[x][y] == 0) {
            map[x][y] = dice[5];
        } else {
            dice[5] = map[x][y];
            map[x][y] = 0;
        }

        System.out.println(dice[0]);
    }
}
