import java.util.Arrays;

class Solution {
    static boolean[] visited;
    static String[] answer;
    public String[] solution(String[][] tickets) {
        int len=tickets.length;
        answer = new String[len+1];
        visited=new boolean[len];
        Arrays.sort(tickets, (a, b) -> {
            if (a[0].equals(b[0])) {
                return a[1].compareTo(b[1]);
            }
            return a[0].compareTo(b[0]);
        });
        
        dfs("ICN", 0, tickets);
        
        return answer;
    }
    
    public boolean dfs(String loc, int depth, String[][] tickets){
        int len=tickets.length;
        answer[depth]=loc;
        
        if(depth==len)
            return true;
        
        for(int i=0; i<len; i++){
            if(!visited[i] && loc.equals(tickets[i][0])){
                visited[i]=true;
                
                if(!dfs(tickets[i][1], depth+1, tickets)){
                    visited[i]=false;
                }else
                    return true;
            }
        }
        
        return false;
    }
}