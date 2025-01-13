class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words={"aya", "ye", "woo", "ma"};
        
        for(String b: babbling){
            boolean check=true;
            
            for(String word: words){
                if(b.contains(word+word)){
                    check=false;
                    break;
                }
                b=b.replace(word, " ");
            }
            
            if(check&&b.trim().isEmpty())
                answer++;
        }
        
        return answer;
    }
}