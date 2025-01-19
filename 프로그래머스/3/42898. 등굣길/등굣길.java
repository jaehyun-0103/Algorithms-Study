class Solution {    
    public int solution(int m, int n, int[][] puddles) {
        int[][] dp=new int[n][m];
        dp[0][0]=1;
        
        for(int[] puddle: puddles) {
            dp[puddle[1]-1][puddle[0]-1] = -1;
        }
        
        for(int i=1; i<n; i++){
            if(dp[i][0]==-1 || dp[i-1][0]==-1){
                break;
            }else{
                dp[i][0]=1;
            }
        }
        
        for(int j=1; j<m; j++){
            if(dp[0][j]==-1 || dp[0][j-1]==-1){
                break;
            }else{
                dp[0][j]=1;
            }
        }
        
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(dp[i][j]==-1){
                    continue;
                }
                if(dp[i-1][j]==-1)
                    dp[i][j]=dp[i][j-1];
                else if(dp[i][j-1]==-1)
                    dp[i][j]=dp[i-1][j];
                else{
                    dp[i][j]=dp[i][j-1] % 1000000007+dp[i-1][j] % 1000000007;
                }
            }
        }
        
        return dp[n-1][m-1] % 1000000007;
    }
}