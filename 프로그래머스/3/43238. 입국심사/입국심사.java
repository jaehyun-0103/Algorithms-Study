class Solution {
    public long solution(int n, int[] times) {
        int max = 0;
        long left, mid, right, cnt;
        
        for (int t : times)
            if (t > max) max = t;
        
        left=1;
        right=(long)max*n;
        
        while(left<=right){
            mid=(left+right)/2;
            cnt = 0;
            for(int i=0; i<times.length; i++){
                cnt+=mid/times[i];
            }
            
            if(cnt>=n)
                right=mid-1;
            else
                left=mid+1;
        }
        
        
        return left;
    }
}