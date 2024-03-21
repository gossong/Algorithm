import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int cnt = citations.length;
        Arrays.sort(citations);
        for(int i = 0; i < citations[cnt-1]; i++){
            int num = 0;
            for(int j = 0; j < cnt; j++){
                if(i <= citations[j]){
                    num++;
                }
            }
            if(i<=num){
                answer = i;
            }
        }
        return answer;
    }
}