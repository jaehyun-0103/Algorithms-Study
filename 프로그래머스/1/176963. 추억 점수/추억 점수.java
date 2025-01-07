import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        HashMap<String, Integer> missing = new HashMap<>();
        
        for(int i=0;i<name.length;i++){
            missing.put(name[i], yearning[i]);
        }
        
        for(int i=0;i<photo.length;i++){
            String[] people = photo[i];
            int score=0;
            
            for(int j=0;j<people.length;j++){
                
                
                if(missing.containsKey(people[j])){
                    score += missing.get(people[j]);
                }
            }
            answer[i] = score;
        }
        
        return answer;
    }
}