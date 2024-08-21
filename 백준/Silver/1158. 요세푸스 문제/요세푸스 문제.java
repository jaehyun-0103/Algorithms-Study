import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] tokens = br.readLine().split(" ");
        int N = Integer.parseInt(tokens[0]);
        int K = Integer.parseInt(tokens[1]);

        List<Integer> people = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        int index = 0;

        sb.append("<");
        while (!people.isEmpty()) {
            index = (index + K - 1) % people.size();
            sb.append(people.remove(index)).append(", ");
        }

        sb.setLength(sb.length() - 2);
        sb.append(">");

        System.out.println(sb.toString());
    }
}
