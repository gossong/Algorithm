class Solution {
    public int[] solution(int start_num, int end_num) {
        int length = end_num-start_num+1;
        int num = 0;
        int[] answer = new int[length];
        for(int i = start_num; i <= end_num; i++){
            answer[num++] = i;
        }
        return answer;
    }
}