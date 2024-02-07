import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int cnt = 1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < emergency.length; i++){
            for(int j = 0; j < emergency.length; j++){
                if(emergency[i] < emergency[j]){
                    cnt++;
                }
            }
            list.add(cnt);
            cnt = 1;
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}