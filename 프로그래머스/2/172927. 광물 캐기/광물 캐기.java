import java.util.*;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        
        int dia=picks[0];
        int iron=picks[1];
        int stone=picks[2];
        int sum=dia+iron+stone;
        int length;
        
        if(minerals.length>sum*5)
            length=sum*5;
        else
            length=minerals.length;
        
        int[][] tired=new int[(int) Math.ceil((double)length/5)][3];
        
        for(int i=0; i<length; i++){
            int index=i/5;
            switch (minerals[i]) {
                case "diamond":
                    tired[index][0]+=1;
                    tired[index][1]+=5;
                    tired[index][2]+=25;
                    break;
                case "iron":
                    tired[index][0]+=1;
                    tired[index][1]+=1;
                    tired[index][2]+=5;
                    break;
                case "stone":
                    tired[index][0]+=1;
                    tired[index][1]+=1;
                    tired[index][2]+=1;
                    break;
            }
        }
        
        Arrays.sort(tired, (a, b) -> Integer.compare(b[2], a[2]));
        
        for (int[] t:tired) {
            if (dia>0) {
                answer+=t[0];
                dia--;
            } else if (iron>0) {
                answer+=t[1];
                iron--;
            } else if (stone>0) {
                answer+=t[2];
                stone--;
            } else {
                break;
            }
        }
        
        return answer;
    }
}