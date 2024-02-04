class Solution {
    public int solution(int[][] arr) {
        int answer = 1;
        int size = arr.length;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(arr[i][j]!=arr[j][i]){
                    answer = 0;
                    break;
                }
            }
        }
        return answer;
    }
}