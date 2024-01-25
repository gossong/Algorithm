import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].indexOf("ad")==-1){
                list.add(strArr[i]);
            }
        }
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}