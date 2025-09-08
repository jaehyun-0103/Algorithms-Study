class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        for(int i=1; i<food.length; i++){
            int num=food[i]/2;
            for(int j=0; j<num; j++){
                sb.append(String.valueOf(i));
            }
        }
        
        answer=answer+sb.toString()+"0"+sb.reverse().toString();
        
        
        
        return answer;
    }
}