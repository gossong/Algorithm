import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        Set<String> set = new LinkedHashSet<>(Arrays.asList(str));
        for(String s : set){
            answer += s;
        }
        return answer;
    }
}