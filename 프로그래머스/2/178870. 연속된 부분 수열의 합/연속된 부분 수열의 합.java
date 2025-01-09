class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int sum=0;
        int start=0, end=sequence.length-1;
        
        for (int L=0, R=0; L<sequence.length; L++) {
            while(R<sequence.length && sum<k) {
                sum+=sequence[R++];
            }
            if(sum==k){
                if(end-start>R-1-L){
                    end=R-1;
                    start=L;
                }
            }
            sum-=sequence[L];
        }
        answer[0]=start;
        answer[1]=end;
        
        return answer;
    }
}