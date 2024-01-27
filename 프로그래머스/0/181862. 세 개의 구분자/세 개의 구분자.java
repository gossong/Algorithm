import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("a|b|c");
        List<String> list = new ArrayList<>();
        for(String a : answer){
            if(!a.equals("")){
                list.add(a);
            }
        }
        if(list.size()!=0){
            answer = list.toArray(new String[0]);
        }else{
            answer = new String[1];
            answer[0] = "EMPTY";
        }
        
        return answer;
    }
}