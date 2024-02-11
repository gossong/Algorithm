class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int num = 1;
        while(k > 1){
            num += 2;
            if(num > numbers.length){
                num = num % numbers.length;
            }
            answer = numbers[num-1];
            k--;
        }
        return answer;
    }
}