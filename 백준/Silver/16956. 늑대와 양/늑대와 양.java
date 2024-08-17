import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        char[][] farm = new char[R][C];
        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            for (int j = 0; j < C; j++) {
                farm[i][j] = line.charAt(j);
            }
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (farm[i][j] == 'W') {
                    if ((i > 0 && farm[i - 1][j] == 'S') ||
                            (i < R - 1 && farm[i + 1][j] == 'S') ||
                            (j > 0 && farm[i][j - 1] == 'S') ||
                            (j < C - 1 && farm[i][j + 1] == 'S')) {
                        System.out.println(0);
                        return;
                    }
                }
            }
        }

        System.out.println(1);
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (farm[i][j] == '.') {
                    if ((i > 0 && farm[i - 1][j] == 'S') ||
                            (i < R - 1 && farm[i + 1][j] == 'S') ||
                            (j > 0 && farm[i][j - 1] == 'S') ||
                            (j < C - 1 && farm[i][j + 1] == 'S')) {
                        farm[i][j] = 'D';
                    }
                }
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(farm[i][j]);
            }
            System.out.println();
        }
    }
}