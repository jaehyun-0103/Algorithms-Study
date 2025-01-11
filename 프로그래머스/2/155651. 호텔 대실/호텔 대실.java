import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        
        Arrays.sort(book_time, new Comparator<String[]>(){
            @Override
            public int compare(String[] o1, String[] o2){
                return o1[0].compareTo(o2[0]);
            }
        });
        
        Queue<int[]> queue=new LinkedList<>();
        
        for(int i=0; i<book_time.length; i++){
            String start_hour=book_time[i][0].split(":")[0];
            String start_minute=book_time[i][0].split(":")[1];
            
            String end_hour=book_time[i][1].split(":")[0];
            String end_minute=book_time[i][1].split(":")[1];
            
            int start=Integer.parseInt(start_hour)*60+Integer.parseInt(start_minute);
            int end=Integer.parseInt(end_hour)*60+Integer.parseInt(end_minute)+10;
            
            if(!queue.isEmpty()){
                int cnt=0;
                while(cnt<queue.size()){
                    int[] room=queue.poll();
                    int startQ=room[0];
                    int endQ=room[1];
                    
                    if(endQ>start)
                        queue.offer(new int[]{startQ, endQ});
                    else
                        break;
                    
                    cnt++;
                }
            }
            
            queue.offer(new int[]{start, end});
            answer=Math.max(answer, queue.size());
            
        }
        
        
        return answer;
    }
}