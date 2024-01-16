import java.util.*;
class Solution {
    public int[] solution(int n) {
        Deque<Integer> deq = new ArrayDeque<>();
        deq.add(n);
        while(n!=1){
            if(n%2==0){
                n/=2;
            }else{
                n=3*n+1;
            }
            deq.add(n);
        }
        
        int[] answer = new int[deq.size()];
        int num = 0;
        for(int d : deq){
            answer[num++] = d;
        }
        return answer;
    }
}