import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int length=B.length-1;

        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int a:  A){
            answer+=a*B[length--];
        }
        
        return answer;
    }
}