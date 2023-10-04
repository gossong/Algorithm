import java.util.*;

public class Solution {
    public Deque<Integer> solution(int []arr) {
        
        Deque<Integer> que = new ArrayDeque<>();
        que.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i]!=arr[i-1]){
                que.add(arr[i]);
            }
        }
        
        return que;
    }
}