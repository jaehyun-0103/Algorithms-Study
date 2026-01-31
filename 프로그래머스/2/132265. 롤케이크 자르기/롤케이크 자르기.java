import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> hm=new HashMap<>();
        Set<Integer> hs=new HashSet<>();
        
        for(int i=0; i<topping.length; i++){
            hm.put(topping[i], hm.getOrDefault(topping[i], 0)+1);
        }
        
        for(int i=0; i<topping.length; i++){        
            hm.put(topping[i], hm.get(topping[i])-1);
            if(hm.get(topping[i])==0)
                hm.remove(topping[i]);
            
            hs.add(topping[i]);
            
            if(hm.size()==hs.size())
                answer++;
        }
        
        
        return answer;
    }
}