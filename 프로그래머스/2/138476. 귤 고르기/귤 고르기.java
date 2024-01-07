import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Arrays.sort(tangerine);

        int[] arr = new int[tangerine[tangerine.length-1]];
        for(int i = 0; i < tangerine.length; i++){
            int num = tangerine[i];
            arr[num-1] += 1;
        }
        
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            k -= arr[arr.length-i-1];
            answer++;
            if(k <= 0){
                break;
            }
        }
        return answer;
    }
}