import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> deq = new ArrayDeque<>();
        
        int i = 0;
        while(i<arr.length){
            if(deq.size()==0){
                deq.add(arr[i++]);
            }else{
                int last = deq.getLast();
                if(last < arr[i]){
                    deq.add(arr[i++]);
                }else{
                    deq.pollLast();
                }
            }
        }
        int[] stk = new int[deq.size()];
        int num = 0;
        for(int d : deq){
            stk[num++] = d;
        }
        return stk;
    }
}