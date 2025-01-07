class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int oneIndex = 0;
        int twoIndex = 0;
        
        for(int i=0; i<goal.length; i++){
            if(oneIndex<cards1.length&&cards1[oneIndex].equals(goal[i])){
                oneIndex++;
                answer = "Yes";
            }
            else if(twoIndex<cards2.length&&cards2[twoIndex].equals(goal[i])){
                twoIndex++;
                answer = "Yes";
            }
            else {
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}