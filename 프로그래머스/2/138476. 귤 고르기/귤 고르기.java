import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> hm=new HashMap<>();
        
        for(int i=0; i<tangerine.length; i++){
            hm.put(tangerine[i], hm.getOrDefault(tangerine[i], 0)+1);
        }
        
        List<Integer> cnts=new ArrayList<>(hm.values());
        Collections.sort(cnts, Collections.reverseOrder());
        
        int total=0;
        for(int cnt: cnts){
            total+=cnt;
            answer++;
            if(total>=k)
                break;
        }
        
        return answer;
    }
}