import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        Deque<Integer> deq = new ArrayDeque<>();
        for(int i = 0; i < intStrs.length; i++){
            int sub = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(sub>k){
                deq.add(sub);
            }
        }

        int[] answer = new int[deq.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = deq.peekFirst();
            deq.pollFirst();
        }
        return answer;
    }
}