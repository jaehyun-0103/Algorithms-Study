import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase();

        int[] freq = new int[26];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            freq[c - 'A']++;
        }

        int maxCount = 0;
        for (int i = 0; i < 26; i++) {
            maxCount = Math.max(maxCount, freq[i]);
        }

        int maxCountIndex = 0;
        int duplication = 0;
        for (int i = 0; i < 26; i++) {
            if (maxCount == freq[i]) {
                duplication++;
                maxCountIndex = i;
            }
        }

        if (duplication > 1) {
            System.out.println("?");
        } else {
            System.out.println((char) ('A' + maxCountIndex));
        }
    }
}