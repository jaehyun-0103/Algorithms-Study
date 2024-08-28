import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] board;
    static List<int[]> snake = new ArrayList<>();
    static int N, K, L;
    static HashMap<Integer, String> hash = new HashMap<>();
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

        board = new int[N][N];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());

            int row = Integer.parseInt(st.nextToken()) - 1;
            int col = Integer.parseInt(st.nextToken()) - 1;
            board[row][col] = 1;
        }

        L = Integer.parseInt(br.readLine());

        for (int i = 0; i < L; i++) {
            st = new StringTokenizer(br.readLine());

            int X = Integer.parseInt(st.nextToken());
            String C = st.nextToken();

            hash.put(X, C);
        }

        int endTime = increaseTime();

        System.out.println(endTime);
    }

    public static int increaseTime() {
        int cx = 0, cy = 0;
        int time = 0;
        int d = 0;
        snake.add(new int[]{0, 0});

        while (true) {
            time++;

            int nx = cx + dx[d];
            int ny = cy + dy[d];

            if (isFinish(nx, ny))
                break;

            if (board[nx][ny] == 1) {
                board[nx][ny] = 0;
                snake.add(new int[]{nx, ny});
            } else {
                snake.add(new int[]{nx, ny});
                snake.remove(0);
            }

            if (hash.containsKey(time)) {
                if (hash.get(time).equals("D")) {
                    d += 1;
                    if (d == 4)
                        d = 0;
                } else {
                    d -= 1;
                    if (d == -1)
                        d = 3;
                }
            }

            cx = nx;
            cy = ny;
        }

        return time;
    }

    public static boolean isFinish(int nx, int ny) {
        if (nx < 0 || ny < 0 || nx >= N || ny >= N) {
            return true;
        }

        for (int[] t : snake) {
            if (nx == t[0] && ny == t[1])
                return true;
        }
        return false;
    }
}
