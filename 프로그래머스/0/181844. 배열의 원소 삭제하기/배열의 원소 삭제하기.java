import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> arr_list = new ArrayList<>();
        for(int a : arr){
            boolean check = true;
            for(int delete : delete_list){
                if(delete == a){
                    check = false;
                }
            }
            if(check){
                list.add(a);
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}