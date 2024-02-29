class Solution {
    public int[] solution(long n) {
        String num = String.valueOf(n);
        String[] arr = num.split("");
        int[] answer = new int[num.length()];
        for(int i = 0; i < answer.length; i++){
            answer[answer.length-1-i] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
}