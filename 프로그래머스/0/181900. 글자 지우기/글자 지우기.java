import java.util.ArrayList;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++){
            list.add(my_string.substring(i,i+1));
        }
        for(int i : indices){
            list.remove(i);
            list.add(i,"-");
        }
        for(int i = 0; i < list.size(); i++){
            if(!list.get(i).equals("-")){
                answer += list.get(i);
            }
        }
        return answer;
    }
}