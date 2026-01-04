import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int index=0;
        Stack<Integer> stack=new Stack<>();
        
        for(int box=1; box<=order.length; box++){
            stack.push(box);
            
            while(!stack.isEmpty() && stack.peek()==order[index]){
                index++;
                answer++;
                stack.pop();
            }
        }
        
        return answer;
    }
}