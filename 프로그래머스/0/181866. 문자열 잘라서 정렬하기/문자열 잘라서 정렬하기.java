import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        List<String> list = new ArrayList<>();
        for(String a : answer){
            if(!a.equals("")){
                list.add(a);
            }
        }
        answer = list.toArray(new String[0]);
        return answer;
    }
}