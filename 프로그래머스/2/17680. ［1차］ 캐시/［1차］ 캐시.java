import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Deque<String> deque = new ArrayDeque<>();
        HashSet<String> hs=new HashSet<>();
        
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        for(int i=0; i<cities.length; i++){ // 앞에서 빼고, 뒤에서 추가
            String city=cities[i].toLowerCase();;
            
            if(deque.size()<cacheSize && !hs.contains(city)){ // 캐시 자리가 있고, 캐시에 없는 값
                deque.offerLast(city);
                hs.add(city);
                
                answer+=5;
            }else{
                if(!hs.contains(city)){ // 캐시 자리가 없고, 캐시에 없는 값
                    String delCity=deque.pollFirst();
                    
                    deque.offerLast(city);
                    hs.remove(delCity);
                    hs.add(city);
                    
                    answer+=5;
                }else{ // 캐시 자리가 없고, 캐시에 있는 값
                    deque.remove(city);
                    deque.offerLast(city);
                    
                    answer+=1;
                }
            }
        }
        
        return answer;
    }
}