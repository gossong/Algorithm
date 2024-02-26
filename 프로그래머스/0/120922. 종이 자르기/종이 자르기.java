class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        for(int i = 1; i < M; i++){
            answer++;
        }
        for(int i = 1; i < N; i++){
            answer+=M;
        }
        return answer;
    }
}