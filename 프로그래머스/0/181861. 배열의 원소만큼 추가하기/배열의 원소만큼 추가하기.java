import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            int count = arr[i];
            while(count>0){
                list.add(arr[i]);
                count--;
            }
        }
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}