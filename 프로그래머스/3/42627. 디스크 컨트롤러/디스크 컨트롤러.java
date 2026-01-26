import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int index=0, curTime, totalTime=0;
        int len=jobs.length;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a, b) -> a[1]-b[1]);
        Arrays.sort(jobs, (a, b) -> a[0]-b[0]);
        
        curTime=jobs[0][0];
        while(index<len || !pq.isEmpty()){
            while(index<len && jobs[index][0]<=curTime){
                pq.offer(jobs[index]);
                index++;
            }
            if(pq.isEmpty()){
                curTime=jobs[index][0];
                continue;
            }
            int[] job=pq.poll();
            curTime+=job[1];
            totalTime+=curTime-job[0];
        }
        return totalTime/len;
    }
}