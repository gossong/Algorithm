import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            int count = arr[i];
            if(flag[i]){
                count*=2;
                while(count>0){
                    list.add(arr[i]);
                    count--;
                }
            }else{
                while(count>0){
                    list.remove(list.size()-1);
                    count--;
                }
            }
        }
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}