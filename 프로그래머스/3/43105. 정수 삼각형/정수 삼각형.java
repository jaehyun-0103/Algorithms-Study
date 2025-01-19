import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        for(int i=triangle.length-1; i>0; i--){ // 4, 3, 2, 1
            for(int j=0; j<triangle[i].length-1; j++){ // 0-3, 0-2, 0-1, 0
                int max=Math.max(triangle[i][j], triangle[i][j+1]);
                triangle[i-1][j]+=max;
            }
        }
        return triangle[0][0];
    }
}