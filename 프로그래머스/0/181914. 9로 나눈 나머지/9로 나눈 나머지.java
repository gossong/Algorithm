class Solution {
    public int solution(String number) {
        int sum = 0;
        String[] number_list = number.split("");
        for(int i = 0; i < number.length(); i++){
            sum += Integer.parseInt(number_list[i]);
        }
        int answer = sum % 9;
        return answer;
    }
}