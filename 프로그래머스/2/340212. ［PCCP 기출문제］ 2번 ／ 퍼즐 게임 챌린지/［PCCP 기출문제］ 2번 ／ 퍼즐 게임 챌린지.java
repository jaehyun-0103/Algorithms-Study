import java.util.*;

class Solution {
    // time<=limit을 만족하는 limit 구하기
    // diffs[i] ≤ level : time=times[i]
    // diffs[i] > level : time=(diffs[i] - level)*(times[i] + times[i-1]) + times[i]
    public int solution(int[] diffs, int[] times, long limit) {
        int left=1, right=diffs[0];
        long time;
        
        for(int i = 1; i < diffs.length; i++) {
            if(diffs[i] > right)
                right = diffs[i];
        }
        
        while(left<=right){
            int level=(left+right)/2;
            time=0;
            
            for(int i=0; i<diffs.length; i++){
                if(i!=0){
                    if(diffs[i] > level){
                        time+=(diffs[i] - level)*(times[i] + times[i-1]) + times[i];
                    }else{
                        time+=times[i];
                    }
                }else{
                    if(diffs[i] > level){
                        time+=(diffs[i] - level)*(times[i]) + times[i];
                    }else{
                        time+=times[i];
                    }
                }
            }
            
            if(time <= limit)
                right=level-1;
            else
                left=level+1;
        }
        return left;
    }
}
