import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        HashSet<Integer> hash=new HashSet<>();
        int l=elements.length;
        int time;
        int index=0;
        int sum;
        
        for(int i=0; i<l; i++){
            sum=0;
            time=0;
            index=i;
            
            while(time<l){
                sum+=elements[index++];
                hash.add(sum);
                
                if(index>=l){
                    index=index-l;
                }
                time++;
            }
        }
        answer=hash.size();
        
        return answer;
    }
}