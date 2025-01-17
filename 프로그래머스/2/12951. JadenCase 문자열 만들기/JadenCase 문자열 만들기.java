class Solution {
    public String solution(String s) {
        String answer = "";
        boolean first=true;
        
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c==' '){
                answer+=" ";
                first=true;
            }else if(first){
                answer+=String.valueOf(c).toUpperCase();
                first=false;
            }else if(!first){
                answer+=String.valueOf(c).toLowerCase();
            }
        }
        
        return answer;
    }
}