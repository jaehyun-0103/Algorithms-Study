import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] honor = new int[k+1];
        int min=Integer.MAX_VALUE;
        
        for(int i=0; i<score.length && i<k; i++){
            min=Math.min(min, score[i]);
            honor[i+1]=score[i];
            answer[i]=min;
        }
        
        for(int i=k; i<score.length; i++){
            honor[0]=score[i];
            Arrays.sort(honor);
            answer[i]=honor[1];
        }
        return answer;
    }
}