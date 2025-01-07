import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        String game=st.nextToken();
        Set<String> names = new HashSet<>();

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            names.add(name);
        }

        if (game.equals("Y"))
            bw.write(String.valueOf(names.size()) + "\n");
        else if (game.equals("F"))
            bw.write(String.valueOf(names.size() / 2) + "\n");
        else if (game.equals("O"))
            bw.write(String.valueOf(names.size() / 3) + "\n");

        bw.flush();
        bw.close();
    }
}