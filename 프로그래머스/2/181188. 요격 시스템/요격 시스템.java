import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 1;
        
        Arrays.sort(targets, (a, b) -> Integer.compare(a[1], b[1]));
        int point=targets[0][1];
        
        for(int i=1; i<targets.length; i++){
            int start=targets[i][0];
            int end=targets[i][1];
            
            if(start<point)
                continue;
            else{
                point=end;
                answer++;
            }
        }
        
        return answer;
    }
}