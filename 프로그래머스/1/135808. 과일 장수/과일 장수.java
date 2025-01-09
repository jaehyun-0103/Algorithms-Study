import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int boxCnt=score.length/m;
        int index=score.length-1;

        Arrays.sort(score);

        for(int i=0; i<boxCnt; i++){
            index-=(m-1);
            answer+=(score[index--]*m);
        }
        return answer;
    }
}