class Solution {
    public int solution(String s) {
        int answer = -1;
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            
            if(sb.length()==0)
                sb.append(c);
            else if(c==sb.charAt(sb.length()-1))
                sb.deleteCharAt(sb.length()-1);
            else
                sb.append(c);
            
        }
        if(sb.length()==0)
            answer=1;
        else
            answer=0;

        return answer;
    }
}