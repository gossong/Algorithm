import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int a : arr){
            if(a%divisor==0){
                list.add(a);
            }
        }
        if(list.size()>0){
            answer = list.stream().mapToInt(x->x).toArray();    
            Arrays.sort(answer);
        }else{
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}