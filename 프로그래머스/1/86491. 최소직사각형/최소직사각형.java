class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]>sizes[i][1]){
                int tmp=sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=tmp;
            }
        }
        
        int wMax=sizes[0][0], hMax=sizes[0][1];
        
        for(int i=1; i<sizes.length; i++){
            if(wMax<sizes[i][0])
                wMax=sizes[i][0];
            if(hMax<sizes[i][1])
                hMax=sizes[i][1];
        }
        answer=hMax*wMax;
        
        return answer;
    }
}