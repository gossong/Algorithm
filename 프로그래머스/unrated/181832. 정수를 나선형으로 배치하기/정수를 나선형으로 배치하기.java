class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int x = 0;  // 행
        int y = -1;  // 열
        
        int num = 1;  // 채울 숫자
        int way = 1;  // 방향에 따라 +1, -1
        
        while(n>0){
            for(int i = 0; i < n; i++){
                y += way;
                answer[x][y] = num++;
            }
            
            n--;
            
            for(int i = 0; i < n; i++){
                x += way;
                answer[x][y] = num++;
            }
            
            way *= -1;
            
        } 
        
        
        return answer;
    }
}