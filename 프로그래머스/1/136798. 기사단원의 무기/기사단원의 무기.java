class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;
        
        for(int i=2; i<=number; i++){
            int cnt=1;
            for(int j=1; j<=i/2; j++){
                if(i%j==0)
                    cnt++;
            }
            
            if(cnt<=limit)
                answer+=cnt;
            else
                answer+=power;
        }
        
        return answer;
    }
}