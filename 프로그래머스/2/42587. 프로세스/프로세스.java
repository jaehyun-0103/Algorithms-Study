import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int cnt=0;
        int idx=priorities.length-1;
        Queue<int[]> queue=new LinkedList<>();
        
        for(int i=0; i<priorities.length; i++){
            queue.add(new int[]{i, priorities[i]});
        }
        
        Arrays.sort(priorities);
        
        while(!queue.isEmpty()){
            int[] q=queue.poll();
            
            if(priorities[idx]==q[1]){
                idx--;
                cnt++;
                if(location==q[0]){
                    break;
                }
            }else{
                queue.add(q);
            }
        }
        
        return cnt;
    }
}