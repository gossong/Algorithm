class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int [] count = new int[201];
        
        for(int i = 0; i < 3; i++){
            int a = lines[i][0] + 100;
            int b = lines[i][1] + 100;
            
            for(int j = a; j < b; j++){
                count[j]++;
            }
        }
        
        for(int i = 0; i<200; i++){
            if(count[i]>1){
                answer += 1;
            }
        }
        
        return answer;
    }
}