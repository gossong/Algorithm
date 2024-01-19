class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        for(int i = e; i > s-1; i--){
            answer+=my_string.substring(i,i+1);
        }
        return my_string.substring(0,s) + answer + my_string.substring(e+1);
    }
}