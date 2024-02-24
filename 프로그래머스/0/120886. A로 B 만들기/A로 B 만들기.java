import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        String[] be = before.split("");
        Arrays.sort(be);
        String[] af = after.split("");
        Arrays.sort(af);
        
        boolean check = true;
        for(int i = 0; i < be.length; i++){
            if(!be[i].equals(af[i])){
                check = false;
                break;
            }
        }
        if(!check){
            answer = 0;
        }
        return answer;
    }
}