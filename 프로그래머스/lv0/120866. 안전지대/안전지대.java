class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int n = board.length;
        int[][] check = new int[n][n];

        // 지뢰 찾기
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j]==1){
                    // 지뢰의 인접한 칸(+1, -1 칸) check(+1) 하기
                    for(int k = i-1; k < i+2; k++){
                        for(int l = j-1; l < j+2; l++){
                            if(k>=0&&l>=0&&k<n&&l<n){
                                check[k][l] += 1;
                            }
                        }
                    }
                }         
            }
        }
        // check되지 않은 칸 확인하기
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(check[i][j]==0) answer++;
            }
        }
        return answer;
    }
}
