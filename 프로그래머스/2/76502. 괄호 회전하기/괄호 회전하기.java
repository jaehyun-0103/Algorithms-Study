import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0, cnt=0;
        boolean flag;
        Stack<Character> stack;
        Map<Character, Character> map = new HashMap<>();
        
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        
        if(s.length()%2==1)
            return 0;
         
        while(cnt<s.length()){
            stack=new Stack<>();
            flag=true;
            
            for (char c : s.toCharArray()) {
                if(c=='(' || c=='[' || c=='{')
                    stack.push(c);
                else{
                    if(!stack.isEmpty() && map.get(c)==stack.peek())
                        stack.pop();
                    else{
                        flag=false;
                        break;
                    }
                }
            }
            
            if(flag && stack.isEmpty())
                answer++;
            s = s.substring(1) + s.charAt(0);
            cnt++;
        }
        
        return answer;
    }
}