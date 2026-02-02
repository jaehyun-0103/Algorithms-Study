import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] arr;
        int[] answer;
        int n=0, index=0;
        int start=0, end=0;
        Set<Integer> hs=new HashSet<>();
        
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)=='{')
                n++;
        }
        arr=new String[n];
        answer=new int[n];
        
        for(int i=1; i<s.length()-1; i++){
            if(s.charAt(i)=='{'){
                start=i;
                
                while(s.charAt(i)!='}'){
                    i++;
                }
                end=i;
                
                String sub=s.substring(start+1, end);
                arr[index]=sub;
                index++;
            }
        }
        Arrays.sort(arr, (a, b) -> a.length()-b.length());
        
        for(int i=0; i<n; i++){
            String[] element=arr[i].split(",");
            
            for(int j=0; j<element.length; j++){
                int num=Integer.parseInt(element[j]);
                if(!hs.contains(num)){
                    hs.add(num);
                    answer[i]=num;
                    break;
                }
            }
        }
        
        return answer;
    }
}
// 1. n = { 개수 - 1
// 2. 2차원 배열에 { } 단위로 넣기
// 3. 배열 크기가 작은거부터 set에 넣으면서 answer 생성