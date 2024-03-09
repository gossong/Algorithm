import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] alp = new int[26];
        Arrays.fill(alp, -1);
        for(int i = 0; i < s.length(); i++){
            char stringToChar = s.charAt(i);
            int charToInt = stringToChar - 'a';
            if(alp[charToInt] == -1){ // 글자 없을 경우
                answer[i] = -1;
            }else{
                answer[i] = i - alp[charToInt];
            }
            alp[charToInt] = i; // 현재 위치 저장
        }
        return answer;
    }
}