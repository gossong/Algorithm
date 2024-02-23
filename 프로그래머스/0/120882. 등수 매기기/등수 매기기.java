import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[score.length];
        for(int i = 0; i < score.length; i++){
            avg[i] = Math.round((score[i][0] + score[i][1]) * 10) / 10.0;
        }
        
        double[] copy = avg.clone();
        Arrays.sort(copy);
        for(int i = 0; i < score.length; i++){
            answer[i]++;
            for(int j = copy.length-1; j >= 0; j--){
                if(copy[j] > avg[i]){
                    answer[i]++;
                }
            }
        }
            
        return answer;
    }
}