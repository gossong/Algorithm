import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        List<String> strList = new ArrayList<>(Arrays.asList(answer));
        strList.removeAll(Arrays.asList(""));
        answer = strList.toArray(new String[0]);
        return answer;
    }
}