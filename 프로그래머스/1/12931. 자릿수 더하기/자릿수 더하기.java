import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n>0){
            int a=n%10;
            n/=10;
            answer+=a;
        }

        return answer;
    }
}