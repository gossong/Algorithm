class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int a = 0;
        int b = 0;
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                if((dots[i][0]-dots[j][0])!=0){
                    a = Math.abs(dots[i][0]-dots[j][0]);
                }
                if((dots[i][1]-dots[j][1])!=0){
                    b = Math.abs(dots[i][1]-dots[j][1]);
                }
                answer = a * b;
            }
        }
        
        return answer;
    }
}