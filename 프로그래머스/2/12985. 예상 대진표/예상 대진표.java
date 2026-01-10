class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;
        int num;
        a-=1; b-=1;

        while(n!=1){
            n/=2;
            if(a/n != b/n){
                answer++;
            }
        }

        return answer;
    }
}