class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String base=Integer.toString(n, k);
        String[] arr=base.split("0");
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(""))
                continue;
            if(isPrime(arr[i]))
                answer++;
        }
        
        return answer;
    }
    
    boolean isPrime(String s) {
        long n=Long.parseLong(s);
        
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}