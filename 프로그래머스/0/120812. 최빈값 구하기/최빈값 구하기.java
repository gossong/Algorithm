import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        // 최빈값 확인
        int[] count = new int[array[array.length-1]+1];
        for(int i = 0; i < array.length; i++){
            count[array[i]]++;
        }
        // count 최댓값 확인
        int max = 0;
        int maxNum = 0;
        for(int i = 0; i < count.length; i++){
            if(max < count[i]){
                max = count[i];
                maxNum = i;
            }
        }        

        // 최빈값 확인
        int check = 0;
        for(int i = 0; i < count.length; i++){
            if(max == count[i]){
                check++;
            }
        }
        if(check>1){
            answer = -1;
        }else{
            answer = maxNum;
        }
        return answer;
    }
}