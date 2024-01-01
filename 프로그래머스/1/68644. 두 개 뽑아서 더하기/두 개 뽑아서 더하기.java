import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
        int len = numbers.length;
        
        ArrayList<Integer> num = new ArrayList<>();
        
        for(int i = 0; i < len; i++){
            for(int j = i+1; j < len; j++){
                int sum = numbers[i] + numbers[j];
                if(!num.contains(sum)){
                    num.add(sum);
                }
            }
        }
        
        int[] answer = new int[num.size()];
        for(int i = 0; i < num.size(); i++){
            answer[i] = num.get(i);
        }
        
        Arrays.sort(answer);
       
        return answer;
    }
}