class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int x=3;
        int y=brown/2-1;
        
        while(x<=y){
            if((x-2)*(y-2)==yellow){
                answer[0]=y;
                answer[1]=x;
                break;
            }
            x=x+1;
            y=brown/2-x+2;
        }
        
        return answer;
    }
}