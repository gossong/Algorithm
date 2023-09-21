class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int x = 0;  // 행
        int y = -1;  // 열
        
        int num = 1;  // 채울 숫자
        int way = 1;  // 방향에 따라 +1, -1
        
        while(n>0){
            // 행(x) 유지, 열(y) 이동
            for(int i = 0; i < n; i++){
                y += way;
                answer[x][y] = num++;
            }
            
            n--;
            
            // 열(y) 유지, 행(x) 이동
            for(int i = 0; i < n; i++){
                x += way;
                answer[x][y] = num++;
            }
            // y축, x축 다 돌면 방향 전환
            way *= -1;
            
        } 
        
        
        return answer;
    }
}
