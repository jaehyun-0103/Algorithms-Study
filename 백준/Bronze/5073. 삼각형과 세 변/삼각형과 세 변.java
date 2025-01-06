import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tri[] = new int[3];

            tri[0] = Integer.parseInt(st.nextToken());
            tri[1] = Integer.parseInt(st.nextToken());
            tri[2] = Integer.parseInt(st.nextToken());

            if (tri[0] == 0 && tri[1] == 0 && tri[2] == 0)
                break;

            Arrays.sort(tri);

            if (tri[2] >= tri[1] + tri[0])
                System.out.println("Invalid");
            else if (tri[2] == tri[1] && tri[1] == tri[0])
                System.out.println("Equilateral");
            else if (tri[2] == tri[1] || tri[1] == tri[0])
                System.out.println("Isosceles");
            else
                System.out.println("Scalene");
        }
    }
}