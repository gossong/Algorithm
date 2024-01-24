class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.substring(i, i+1).equals(alp)){
                answer += my_string.substring(i, i+1).toUpperCase();
            }else{
                answer += my_string.substring(i, i+1);
            }
        }
        return answer;
    }
}