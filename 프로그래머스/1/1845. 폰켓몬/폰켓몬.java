import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int N=nums.length/2;
        
        HashSet<Integer> numbers=new HashSet<>();
        
        for(int num: nums)
            numbers.add(num);
        
        answer=Math.min(numbers.size(), N);
            
        return answer;
    }
}