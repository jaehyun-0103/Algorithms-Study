import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        HashMap<String, Integer> hm=new HashMap<>();
        for(int i=0; i<players.length; i++){
            hm.put(players[i], i);
        }
        for(int i=0; i<callings.length; i++){
            int ranking=hm.get(callings[i]);
            String tmp=players[ranking];
            players[ranking]=players[ranking-1];
            players[ranking-1]=tmp;
            
            hm.put(players[ranking-1], ranking-1);
            hm.put(players[ranking], ranking);
        }
        
        return players;
    }
}