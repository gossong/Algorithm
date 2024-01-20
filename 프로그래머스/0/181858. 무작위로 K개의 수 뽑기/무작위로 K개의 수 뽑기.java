import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        arr = Arrays.stream(arr).distinct().toArray();
        int size = Math.min(arr.length, k);
        for(int i = 0; i < size; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}