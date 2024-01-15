import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        
        for(int i = 0; i < queries.length; i++){
            int first = queries[i][0];
            int firstnum = answer[first];
            int second = queries[i][1];
            answer[first] = answer[second];
            answer[second] = firstnum;
        }
        return answer;
    }
}