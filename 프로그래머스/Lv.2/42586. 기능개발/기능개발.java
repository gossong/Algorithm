import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int cntDay = 0;  // 작업 일수
        Deque<Integer> day = new ArrayDeque<>();
        
        for(int i = 0; i < progresses.length; i++){
            progresses[i] += speeds[i]*cntDay;
            while(progresses[i] < 100){
                progresses[i]+=speeds[i];
                cntDay++;
            }
            day.add(cntDay);
        }
            
        int check = day.getFirst();
        day.poll();
        int count = 1;
        Deque<Integer> ans = new ArrayDeque<>();
        
        for(int d : day){
            if(check == d){
                count++;
            }else{
                ans.add(count);
                day.poll();
                check = d;
                count = 1;
            }
        }
        ans.add(count);
        
        int[] answer = new int[ans.size()];
        int index = 0;
        for (Integer num : ans) {
            answer[index++] = num;
        }

        return answer;
    }
}