import java.util.Arrays;

class Solution {
    public int solution(int x, int y, int n) {
        int []dp=new int[y+1];
        Arrays.fill(dp, 1000001);
        
        dp[y]=0;
        
        for(int i=y; i>x; i--){
            if(i-n>=x){
                dp[i-n]=Math.min(dp[i-n], dp[i]+1);
            }
            if(i/2>=x && i%2==0){
                dp[i/2]=Math.min(dp[i/2], dp[i]+1);
            }
            if(i/3>=x && i%3==0){
                dp[i/3]=Math.min(dp[i/3], dp[i]+1);
            }
        }
        
        if(dp[x]==1000001)
            return -1;

        return dp[x];
    }
}