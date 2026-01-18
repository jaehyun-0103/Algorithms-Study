import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        int cur = calDate(progresses[0], speeds[0]);
        int n=1;
        
        for(int i=1; i<progresses.length; i++){
            int date=calDate(progresses[i], speeds[i]);
            
            if(cur>=date)
                n++;
            else{
                result.add(n);
                cur = calDate(progresses[i], speeds[i]);
                n=1;
            }
                
        }
        result.add(n);
        
        int[] answer = new int[result.size()];
        
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        
        return answer;
    }
    
    int calDate(int pro, int sp){
        int left=100-pro;
        if(left%sp==0)
            return left/sp;
        else
            return left/sp + 1;
    }
}