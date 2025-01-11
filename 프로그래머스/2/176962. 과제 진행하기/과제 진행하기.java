import java.util.*;

class Solution {
    public String[] solution(String[][] plans) {
        String[] answer = new String[plans.length];
        ArrayList<String> arr=new ArrayList<>();
        
        int timer=0;
        
        Arrays.sort(plans, new Comparator<String[]>(){
            @Override
            public int compare(String[] o1, String[] o2){
                return o1[1].compareTo(o2[1]);
            }
        });
        
        Stack<String[]> stack=new Stack<>();
        
        for(int i=0; i<plans.length; i++){
            String start_hour=plans[i][1].split(":")[0];
            String start_minute=plans[i][1].split(":")[1];
            int start=Integer.parseInt(start_hour)*60+Integer.parseInt(start_minute);
            int end=Integer.parseInt(plans[i][2]);
            
            while(!stack.isEmpty()&&timer+Integer.parseInt(stack.peek()[1])<=start){
                String[] task=stack.pop();
                arr.add(task[0]);
                timer+=Integer.parseInt(task[1]);
            }
            
            if(stack.isEmpty()){
                stack.push(new String[]{plans[i][0], String.valueOf(end)});
                timer=start;
            } else if(timer+Integer.parseInt(stack.peek()[1])>start){
                stack.peek()[1]=String.valueOf(Integer.parseInt(stack.peek()[1])-(start-timer));
                
                stack.push(new String[]{plans[i][0], String.valueOf(end)});
                timer=start;
            }
        }
        
        while(!stack.isEmpty()){
            timer+=Integer.parseInt(stack.peek()[1]);
            arr.add(stack.pop()[0]);
        }
        
        arr.toArray(answer);
        
        return answer;
    }
}