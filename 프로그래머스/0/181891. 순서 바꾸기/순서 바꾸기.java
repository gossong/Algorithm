import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr1 = Arrays.copyOfRange(num_list, n, num_list.length);
        for(int i : arr1){
            list.add(i);
        }
        int[] arr2 = Arrays.copyOfRange(num_list, 0, n);
        for(int j : arr2){
            list.add(j);
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}