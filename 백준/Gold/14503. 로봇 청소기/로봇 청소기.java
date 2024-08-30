import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M, r, c, d;
    static int[][] room;
    static final int[] dx = {-1, 0, 1, 0};
    static final int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        room = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                room[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cleaning();
    }

    public static void cleaning() {
        int cleaned = 0;

        while (true) {
            if (room[r][c] == 0) {
                room[r][c] = 2;
                cleaned++;
            }
            
            boolean foundUncleaned = false;

            for (int i = 0; i < 4; i++) {
                int newDir = (d + 3 - i) % 4;
                int newRow = r + dx[newDir];
                int newCol = c + dy[newDir];

                if (isInBounds(newRow, newCol) && room[newRow][newCol] == 0) {
                    foundUncleaned = true;
                    r = newRow;
                    c = newCol;
                    d = newDir;
                    break;
                }
            }

            if (!foundUncleaned) {
                int backDir = (d + 2) % 4;
                int backRow = r + dx[backDir];
                int backCol = c + dy[backDir];

                if (isInBounds(backRow, backCol) && room[backRow][backCol] != 1) {
                    r = backRow;
                    c = backCol;
                } else {
                    break;
                }
            }
        }

        System.out.println(cleaned);
    }

    public static boolean isInBounds(int row, int col) {
        return row >= 0 && row < N && col >= 0 && col < M;
    }
}
