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

        // 이진법으로 풀이
        // for (int i = 1; i < 64; i++) {
        //     int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
        //     if (l <= num && num <= r)
        //         list.add(num);
        // }
        
        if(result.isEmpty()){
            return new int[] {-1};
        } else {
            int[] answer = new int[result.size()];
            for(int i = 0; i < result.size(); i++){
                answer[i] = result.get(i);
            }
            // ArrayList result를 배열로 변환할 때, 
            // Java 8 이상에서는 'stream.mapToInt(i -> i).toArray() 메소드 사용하여 변환 가능
            // result.stream().mapToInt(i -> i).toArray();
            return answer;
        }

    }
}
