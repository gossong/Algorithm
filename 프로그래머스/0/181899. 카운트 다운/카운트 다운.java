class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start-end_num+1];
        int num = start;
        int count = 0;
        while(num>=end_num){
            answer[count++] = num;
            num--;
        }
        return answer;
    }
}