import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        String game=st.nextToken();
        Set<String> names = new HashSet<>();
        
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            names.add(name);
        }

        if(game.equals("Y"))
            System.out.println(names.size());
        else if(game.equals("F"))
            System.out.println(names.size()/2);
        else if(game.equals("O"))
            System.out.println(names.size()/3);
    }
}