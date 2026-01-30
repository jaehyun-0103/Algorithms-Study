import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        int len=numbers.length;
        String[] s=new String[len];
        
        for(int i=0; i<len; i++){
            s[i]=String.valueOf(numbers[i]);
        }
        
        Arrays.sort(s, (a, b)-> (b+a).compareTo(a+b));
        if(s[0].equals("0"))
            return "0";
        
        for(int i=0; i<numbers.length; i++){
            answer+=s[i];
        }
        
        return answer;
    }
}