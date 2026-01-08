import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashMap<String, Integer> hm=new HashMap<>();
        hm.put(words[0], 0);
        
        for(int i=1; i<words.length; i++){
            char preLast = words[i-1].charAt(words[i-1].length()-1);
            char postFirst = words[i].charAt(0);
            
            if(hm.containsKey(words[i]) || preLast!=postFirst){
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                
                return answer;
            }
            
            hm.put(words[i], i);
        }

        return answer;
    }
}