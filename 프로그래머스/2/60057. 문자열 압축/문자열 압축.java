class Solution {
    public int solution(String s) {
        int answer = s.length();
        int cnt;
        String result="";
        
        for(int len=1; len<=s.length()/2; len++){
            String pre=s.substring(0, 0+len);
            cnt=1;
            result="";
            int last=0;
            
            for(int i=len; i+len<=s.length(); i+=len){
                if(pre.equals(s.substring(i, i+len))){
                    cnt++;
                }else{
                    if(cnt>1)
                        result+=cnt+pre;
                    else
                        result+=pre;
                    
                    pre=s.substring(i, i+len);
                    cnt=1;
                }
                last=i+len;
            }
            if(cnt>1)
                result+=cnt+pre;
            else
                result+=pre;
            result+=s.substring(last, s.length());
            answer=Math.min(answer, result.length());
        }
        
        return answer;
    }
}