class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int cntP=0, cntY=0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='P' || s.charAt(i)=='p'){
                cntP++;
            }
            if(s.charAt(i)=='Y' || s.charAt(i)=='y'){
                cntY++;
            }
        }
        
        if(cntP==0 && cntY==0)
            answer=true;
        else if(cntP==cntY)
            answer=true;
        else
            answer=false;

        return answer;
    }
}