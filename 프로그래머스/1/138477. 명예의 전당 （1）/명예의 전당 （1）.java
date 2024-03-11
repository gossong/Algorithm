import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        for(int i = 0; i < score.length; i++){
            int[] arr = Arrays.copyOfRange(score, 0, i+1);
            Arrays.sort(arr);
            int temp = arr[0];
            if(arr.length > k){
                temp = arr[arr.length-k];
            }
            answer[i] = temp;
        }
        return answer;
    }
}