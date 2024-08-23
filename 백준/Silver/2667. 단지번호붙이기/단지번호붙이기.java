import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int[][] map;
    static boolean[][] visited;
    private static final List<Integer> apartmentSizes = new ArrayList<>();
    static int N;

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    apartmentSizes.add(bfs(i, j));
                }
            }
        }

        Collections.sort(apartmentSizes);
        System.out.println(apartmentSizes.size());
        for (int size : apartmentSizes) {
            System.out.println(size);
        }
    }

    static int bfs(int startX, int startY) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(startX, startY));
        visited[startX][startY] = true;
        int count = 0;

        while (!queue.isEmpty()) {
            Point current = queue.poll();
            count++;

            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny] && map[nx][ny] == 1) {
                    queue.offer(new Point(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }
        return count;
    }
}
