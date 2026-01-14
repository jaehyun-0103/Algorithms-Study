import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int)(right - left + 1);
        int[] answer = new int[len];
        
        for(long i=left; i<=right; i++){
            long row=i/n;
            long col=i%n;
            
            long num=Math.max(row, col)+1;
            answer[(int)(i - left)]=(int)num;
            
        }
        return answer;
    }
}