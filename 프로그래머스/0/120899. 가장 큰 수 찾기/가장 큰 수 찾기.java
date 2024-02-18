class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = array[0];
        int index = 0;
        for(int a : array){
            max = Math.max(max, a);
        }
        for(int i = 0; i < array.length; i++){
            if(array[i]==max){
                index = i;
                break;
            }
        }
        answer[0] = max;
        answer[1] = index;
        return answer;
    }
}