import java.util.*;

class Solution {
    public int[] solution(int l, int r) {

        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = l; i <= r; i++){
            String num = Integer.toString(i);
            boolean check = true;
            
            // 0과 5로만 이루어진 수 = true
            for(int j = 0; j < num.length(); j++){
                if(num.charAt(j) != '0' && num.charAt(j) != '5'){
                    check = false;
                    break;
                }
            }
            // true인 것만 add
            if(check){
                result.add(i);
            }
        }
        
        if(result.isEmpty()){
            return new int[] {-1};
        } else {
            int[] answer = new int[result.size()];
            for(int i = 0; i < result.size(); i++){
                answer[i] = result.get(i);
            }
            return answer;
        }

    }
}