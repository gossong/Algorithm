import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] ans = new int[3];
        int[] ansOne = {1, 2, 3, 4, 5};
        int[] ansTwo = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] ansThree = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i]==ansOne[i%ansOne.length]){
                ans[0]++;
            }
            if(answers[i]==ansTwo[i%ansTwo.length]){
                ans[1]++;
            }
            if(answers[i]==ansThree[i%ansThree.length]){
                ans[2]++;
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        int max = Math.max(ans[0], Math.max(ans[1], ans[2]));
        if (ans[0] == max){
            list.add(1);
        }
        if (ans[1] == max){
            list.add(2);
        }
        if (ans[2] == max){
            list.add(3);
        }
        int[] answer = new int[list.size()];
        for(int j = 0; j < list.size(); j++){
            answer[j] = list.get(j);
        }
        return answer;
    }
}