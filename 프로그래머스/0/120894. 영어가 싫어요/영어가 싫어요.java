class Solution {
    public long solution(String numbers) {
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String string_num = numbers;
        for(int i = 0; i < number.length; i++){
            string_num = string_num.replaceAll(number[i] ,i + "");
        } 
        long answer = Long.parseLong(string_num);
        return answer;
    }
}