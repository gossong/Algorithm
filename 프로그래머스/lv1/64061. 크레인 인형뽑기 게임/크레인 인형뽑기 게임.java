import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Deque<Integer> basket = new ArrayDeque<Integer>();
        
        for(int m : moves){
            for(int i = 0; i < board.length; i++){
                // board 0이 아닐 경우 (인형이 있을 경우)
                if(board[i][m-1]!=0){
                    // basket의 마지막 값과 board의 값 비교해서 일치할 경우
                    // answer+=2, basket 마지막 값 제거, board 값 0으로 바꾸기
                    if(basket.size()>0 && basket.getLast()==board[i][m-1]){
                        answer += 2;
                        basket.removeLast();
                        board[i][m-1] = 0;
                        break;
                    // 일치하지 않을 경우
                    // basket에 board 값 넣고, board 값 0으로 바꾸기
                    }else{
                        basket.add(board[i][m-1]);
                        board[i][m-1] = 0;
                        break; 
                    }
                }
            }
        }
        
        return answer;
    }
}