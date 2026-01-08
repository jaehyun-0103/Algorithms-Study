import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashMap<String, Integer> hm=new HashMap<>();
        int order=1;
        hm.put(words[0], 0);
        
        for(int i=1; i<words.length; i++){
            char preLast, postFirst;
            preLast=words[i-1].charAt(words[i-1].length()-1);
            postFirst=words[i].charAt(0);
            
            if(i%n==0){
                order++;
            }
            
            if(hm.containsKey(words[i])){
                answer[0]=i%n+1;
                answer[1]=order;
                
                break;
            } else if(preLast!=postFirst){
                answer[0]=i%n+1;
                answer[1]=order;
                    
                break;
            } else{
                hm.put(words[i], i);
            }
        }

        return answer;
    }
}