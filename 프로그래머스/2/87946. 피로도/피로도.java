class Solution {
    static boolean[] visited;
    static int max=0;
    public int solution(int k, int[][] dungeons) {
        int depth=0;
        visited=new boolean[dungeons.length];
        
        dfs(dungeons, depth, k);
        
        return max;
    }
    public void dfs(int[][] dungeons, int depth, int k){
        if(max<depth){
            max=depth;
        }
        
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i] && k>=dungeons[i][0]){
                visited[i]=true;
                dfs(dungeons, depth+1, k-dungeons[i][1]);
                visited[i]=false;
            }
        }
    }
}