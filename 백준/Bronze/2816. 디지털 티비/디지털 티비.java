import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int kbs1Index = -1, kbs2Index = -1;

        List<String> channels = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String channel = br.readLine();
            channels.add(channel);
            if (channel.equals("KBS1")) kbs1Index = i;
            if (channel.equals("KBS2")) kbs2Index = i;
        }

        StringBuilder result = new StringBuilder();

        result.append("1".repeat(Math.max(0, kbs1Index)));
        result.append("4".repeat(Math.max(0, kbs1Index)));

        if (kbs1Index > kbs2Index) {
            kbs2Index++;
        }

        result.append("1".repeat(Math.max(0, kbs2Index)));
        result.append("4".repeat(Math.max(0, kbs2Index - 1)));

        System.out.println(result);
    }
}