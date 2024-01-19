class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            answer++;
            String ans = Integer.toString(answer);
            while(answer%3==0||ans.contains("3")){
                answer++;
                ans = Integer.toString(answer);
            }
        }
        return answer;
    }
}