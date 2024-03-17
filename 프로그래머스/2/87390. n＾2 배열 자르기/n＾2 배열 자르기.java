import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        // 메모리 초과
        // int[][] arr = new int[n][n];
        // for(int i = 0 ; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         arr[i][j] = i+1;
        //         arr[j][i] = i+1;
        //     }
        // }
        // int[] ans = new int[n*n];
        // int num = 0;
        // for(int i = 0 ; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         ans[num++] = arr[i][j];
        //     }
        // }
        // int[] answer = Arrays.copyOfRange(ans, (int)left, (int)right+1);
        
        int len = (int)(right-left)+1;
        int[] answer = new int[len];
        for(int i = 0; i < len; i++){
            int x = (int)(left/n) + 1;
            int y = (int)(left%n) + 1;
            left++;
            answer[i] = Math.max(x,y); // x, y 중 최대 값이 결과
        }
        return answer;
    }
}