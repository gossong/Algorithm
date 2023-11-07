import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        // split을 사용할 경우, 연속해서 나오는 공백문자를 처리할 수 없음
        // String[] split = s.toLowerCase().split("\\s");
        // for(int i = 0; i < split.length; i++){
        //     answer += split[i].substring(0,1).toUpperCase() + split[i].substring(1,split[i].length()) + " ";
        // }
        // return answer.substring(0,answer.length()-1);
        
        // StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(s.toLowerCase(), " ", true);
        while(st.hasMoreTokens()){
            String word = st.nextToken();
            answer += word.substring(0,1).toUpperCase() + word.substring(1,word.length());
        }
        return answer;
        
    }
}