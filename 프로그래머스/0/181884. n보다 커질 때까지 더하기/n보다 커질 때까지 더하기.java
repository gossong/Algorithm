class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int num = 0;
        do{
            answer += numbers[num++];
        } while (answer <= n);
        return answer;
    }
}