import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        int mul=1;
        HashMap<String, Integer> hm=new HashMap<>();
        
        for(int i=0; i<clothes.length; i++){
            if(!hm.containsKey(clothes[i][1])){
                hm.put(clothes[i][1], 1);
            } else{
                hm.put(clothes[i][1], hm.get(clothes[i][1])+1);
            }
        }
        
        List<Integer> cntList = new ArrayList<>(hm.values());
        for(int i=0; i<hm.size(); i++){
            mul*=(cntList.get(i)+1);
        }
        
        answer = mul-1;
        
        return answer;
    }
}