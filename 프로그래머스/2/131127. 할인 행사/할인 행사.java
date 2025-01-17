import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> hm=new HashMap<>();
        
        for(int i=0; i<want.length; i++){
            hm.put(want[i], number[i]);
        }
        
        for(int i=0; i<=discount.length-10; i++){
            HashMap<String, Integer> copy=new HashMap<>(hm);
            
            for(int j=i; j<i+10; j++){
                String key=discount[j];
                
                if(copy.containsKey(key)&&copy.get(key)!=0){
                    copy.replace(key, copy.get(key)-1);
                    if(copy.get(key)==0)
                        copy.remove(key);
                }
            }
            if(copy.isEmpty())
                answer++;
        }
        
        return answer;
    }
}