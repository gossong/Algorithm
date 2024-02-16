import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int len = numlist.length;
        int[] answer = new int[len];
        double[] abs = new double[len];
        for(int i = 0; i < len; i++){
            abs[i] = Math.abs(n+0.1-numlist[i]);
        }
        Arrays.sort(abs);
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(Math.abs(n+0.1-numlist[j])==abs[i]){
                    answer[i] = numlist[j];
                }
            }
        }
        return answer;
    }
}