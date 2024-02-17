import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n/2; i++){
            if(n%i==0){
                list.add(i);
            }
        }
        list.add(n);
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}