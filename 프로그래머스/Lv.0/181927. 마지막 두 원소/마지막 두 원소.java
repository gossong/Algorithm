class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length+1];
        int a = 0; int b = 0;
        
        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[i];
            
            if(i == length-1){
                a = answer[i];
            }
            if(i == length-2){
                b = answer[i];
            }
        }
        answer[length] = a > b ? a - b : a*2;

        return answer;
    }
}