class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++){
            int check = my_string .charAt(i) - '0';
            if(check < 10){
                answer += check;
            }
        }
        return answer;
    }
}