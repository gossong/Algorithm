import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i]!=min){
                list.add(arr[i]);
            }
        }
        int[] answer = {};
        if(list.size()>0){
            answer = list.stream().mapToInt(i->i).toArray();
        }else{
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}