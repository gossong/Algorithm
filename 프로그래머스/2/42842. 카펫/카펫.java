class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        for(int i = 1; i < brown; i++){
            y = i;
            x = yellow / y;
            if(((x+2)*(y+2) == brown+yellow) && (2*(x+2)+2*(y+2)-4 == brown)){
                break;
            }
        }
        answer[0] = Math.max(x,y)+2;
        answer[1] = Math.min(x,y)+2;
        return answer;
    }
}