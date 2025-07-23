class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] numberWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<numberWords.length; i++){
            s=s.replaceAll(numberWords[i], Integer.toString(i));
        }
        
        answer=Integer.parseInt(s);
        
        return answer;
    }
}