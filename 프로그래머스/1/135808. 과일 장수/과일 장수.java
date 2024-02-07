import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i = m-1; i < score.length; i+=m){
            answer += score[score.length-i-1] * m;
        }
        return answer;
    }
}