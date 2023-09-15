class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String star = "*";
        answer = star.repeat(phone_number.length()-4).concat(phone_number.substring(phone_number.length()-4));
        return answer;
    }
}