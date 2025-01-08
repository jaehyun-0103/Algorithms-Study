class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int l=p.length();
        
        for(int i=0; i<=t.length()-l; i++){
            String s=t.substring(i, i+l);
            
            if(Long.parseLong(s)<=Long.parseLong(p))
                answer++;
        }
        
        return answer;
    }
}