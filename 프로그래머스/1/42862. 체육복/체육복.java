class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student=new int[n];
        
        for(int i=0; i<n; i++) student[i]=1;
        
        for(int l:lost) student[l-1]--;
        for(int r:reserve) student[r-1]++;
        
        for(int i=0; i<n; i++){
            if(student[i]==0){
                if(i>0 && student[i-1]==2){
                    student[i-1]-=1;
                    student[i]+=1;
                }else if(i<n-1 && student[i+1]==2){
                    student[i+1]-=1;
                    student[i]+=1;
                }
            }
        }
        for(int i=0; i<n; i++){
            if(student[i]>=1)
                answer++;
        }
        
        return answer;
    }
}
// 1 2 0 0 2 0 2  성공
// 1 2 0 0 2 0 1  실패
// 0 2 1 0 2 0 2  성공
// 0 2 0 0 2 0 1  실패