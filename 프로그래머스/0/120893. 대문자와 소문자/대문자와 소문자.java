class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(char my : my_string.toCharArray()){
            if(Character.isUpperCase(my)){
                answer += Character.toLowerCase(my);
            }else{
                answer += Character.toUpperCase(my);
            }
        }
        return answer;
    }
}