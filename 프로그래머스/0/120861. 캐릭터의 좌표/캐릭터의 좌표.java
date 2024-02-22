class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int maxX = board[0]/2;
        int maxY = board[1]/2;
        for(String key : keyinput){
            switch (key){
                case "up":
                    answer[1]++; 
                    if(Math.abs(answer[1]) > board[1]/2){
                        answer[1] = answer[1] > 0 ? board[1]/2 : -(board[1]/2);
                    }
                    break;
                case "down":
                    answer[1]--; 
                    if(Math.abs(answer[1]) > board[1]/2){
                        answer[1] = answer[1] > 0 ? board[1]/2 : -(board[1]/2);
                    }
                    break;
                case "left":
                    answer[0]--; 
                    if(Math.abs(answer[0]) > board[0]/2){
                        answer[0] = answer[0] > 0 ? board[0]/2 : -(board[0]/2);
                    }
                    break;
                case "right":
                    answer[0]++; 
                    if(Math.abs(answer[0]) > board[0]/2){
                        answer[0] = answer[0] > 0 ? board[0]/2 : -(board[0]/2);
                    }
                    break;
            }
        }
        return answer;
    }
}