class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        float[] slope = new float[6];
        int index = 0;
        
        for(int i = 0; i < 4; i++){
            double x1 = dots[i][0];
            double y1 = dots[i][1];
            
            for(int j = i+1; j < 4; j++){
                double x2 = dots[j][0];
                double y2 = dots[j][1];
                slope[index++] = (float)((y2-y1)/(x2-x1));  // 기울기
            } 
        }
        
        for(int i = 0; i<3; i++){
            if(slope[i]-slope[5-i]==0){
                answer = 1;
            }
        }
        
        return answer;
    }
}