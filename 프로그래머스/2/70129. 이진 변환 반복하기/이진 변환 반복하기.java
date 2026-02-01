class Solution {
    public int[] solution(String s) {
        int[] answer;
        int removeZero=0, cnt=0;
        
        while(!s.equals("1")){
            int zeroCnt=0;
            int afterLen=0;
            
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0')
                    zeroCnt++;
            }
            s=s.replace("0", "");
            afterLen=s.length();
            s=Integer.toBinaryString(afterLen);
            
            removeZero+=zeroCnt;
            cnt++;
        }
        
        return new int[]{cnt, removeZero};
    }
}