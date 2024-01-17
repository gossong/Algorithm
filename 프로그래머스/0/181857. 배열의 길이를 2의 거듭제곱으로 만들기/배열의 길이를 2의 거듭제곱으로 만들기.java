class Solution {
    public int[] solution(int[] arr) {
        int num = 1;
        while(true){
            if(arr.length <= num){
                break;
            }
            num = num * 2;
        }
        
        int[] answer = new int[num];
        for(int i = 0; i < num; i++){
            if(i<arr.length){
                answer[i] = arr[i];
            }else{
                answer[i] = 0;
            }
        }
        return answer;
    }
}