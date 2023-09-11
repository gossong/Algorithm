class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int s = 0;
        if(n>=10){
            s = n/10;
        }
        answer = n*12000 + (k-s)*2000;
        return answer;
    }
}