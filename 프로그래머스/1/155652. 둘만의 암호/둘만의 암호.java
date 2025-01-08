import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        HashSet<Character> skipWord = new HashSet<>();
        
        for(int i=0; i<skip.length(); i++){
            skipWord.add(skip.charAt(i));
        }
        
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            int position=index;
            
            for(int j=1; j<=position; j++){
                if(c+j>122)
                    c-=26;
                
                if(skipWord.contains((char)(c+j)))
                    position++;
            }
            answer+=(char)(c+position);
            
        }
        return answer;
    }
}