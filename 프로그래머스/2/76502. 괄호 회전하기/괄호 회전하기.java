import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0, cnt=0;
        Map<Character, Character> map = new HashMap<>();
        
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        
        if(s.length()%2==1)
            return 0;
         
        while(cnt<s.length()){
            if(isValid(s, map))
                answer++;
            s = s.substring(1) + s.charAt(0);
            cnt++;
        }
        
        return answer;
    }
    
    private boolean isValid(String s, Map<Character, Character> map){
        Stack<Character> stack=new Stack<>();;
        
        for (char c : s.toCharArray()) {
            if(c=='(' || c=='[' || c=='{')
                stack.push(c);
            else{
                if(!stack.isEmpty() && map.get(c)==stack.peek())
                    stack.pop();
                else{
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}