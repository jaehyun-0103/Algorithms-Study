import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }


        for (int i = 0; i < M; i++) {
            String[] otherLine = br.readLine().split(" ");
            int u = Integer.parseInt(otherLine[0]);
            int v = Integer.parseInt(otherLine[1]);
            graph[u].add(v);
            graph[v].add(u);
        }

        int connectedComponents = 0;

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                connectedComponents++;
            }
        }

        System.out.println(connectedComponents);
    }

    static void dfs(int node) {
        visited[node] = true;

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }
}
