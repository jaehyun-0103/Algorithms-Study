import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        StringBuilder sb=new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            String tmp=sb.toString();
            
            if(tmp.contains(String.valueOf(c))){
                answer[i]=i-tmp.lastIndexOf(String.valueOf(c));
                sb.append(c);
            }
            else{
                sb.append(c);
                answer[i]=-1;
            }
        }
        
        return answer;
    }
}