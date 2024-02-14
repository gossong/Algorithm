import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++){
            if(isInteger(my_string.substring(i, i+1))){
                list.add(Integer.parseInt(my_string.substring(i, i+1)));
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        return answer;
    }
    
    public static boolean isInteger(String strValue) {
        try {
          Integer.parseInt(strValue);
          return true;
        } catch (NumberFormatException ex) {
          return false;
        }
  }
}