class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = arr;
        for(int i = 0; i < arr.length; i++){
            answer[i] = k%2==0 ? arr[i] + k : arr[i] * k;
        }
        return answer;
    }
}