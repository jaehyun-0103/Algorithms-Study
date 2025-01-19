class Solution {
    boolean[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited=new boolean[n];
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                answer++;
                dfs(computers, i);
            }
        }
        
        
        return answer;
    }
    
    public void dfs(int[][] computers, int computer){
        visited[computer]=true;
        
        for(int i=0; i<computers.length; i++){
            if(!visited[i] && computers[computer][i]==1){
                dfs(computers, i);
            }
        }
    }
}