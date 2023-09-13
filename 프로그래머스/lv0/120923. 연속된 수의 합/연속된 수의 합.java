class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        if ((total%num)==0){
            for(int i=0; i<=num-1; i++){
                answer[i] = (total/num)-(num/2)+i;
            }
        }else{
            for(int i=0; i<=num-1; i++){
                answer[i] = (total/num)-(num/2)+i+1;
            }
        }
        
        return answer;
    }
}