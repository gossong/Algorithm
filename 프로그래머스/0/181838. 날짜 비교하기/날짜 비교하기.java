class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        int i = 0;
        while(i < 3){
            if(date1[i] == date2[i]){
                i++;
            }else{
                if(date1[i] < date2[i]){
                    answer = 1;
                    break;
                }else{
                    answer = 0;
                    break;
                }
            }
        }
        return answer;
    }
}