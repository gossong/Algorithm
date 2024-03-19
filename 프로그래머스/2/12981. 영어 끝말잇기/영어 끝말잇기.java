import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> list = new ArrayList<>();
        list.add(words[0]);
        
        for(int i = 1; i < words.length; i++){
            if(!words[i].startsWith(words[i-1].substring(words[i-1].length()-1))){ // 끝말잇기 확인
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                return answer;
            }
            if(list.contains(words[i])){ // 중복 확인
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                return answer;   
            }
            
            list.add(words[i]);
        }

        return answer;
    }
}