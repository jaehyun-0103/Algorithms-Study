class Solution {
    public int solution(int n) {
        int answer = 0;
        int max_index;
        int cnt;
        
        if(n%2==0){
            max_index=n/2-1;
        }else{
            max_index=n/2;
        }
        
        for(int i=1; i<=max_index; i++){
            int sum=0;
            cnt=i;
            while(sum<=n){
                sum+=cnt;
                cnt++;
            }
            
            sum-=(cnt-1);
            
            if(sum==n)
                answer++;
        }
        
        return answer+1;
    }
}