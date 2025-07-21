class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int get=0;
        
        while(n>=a){
            get=(n/a)*b; // 받은 콜라
            answer+=get;
            n=n%a; // 남은 빈병
            n+=get;
        }
        
        return answer;
    }
}