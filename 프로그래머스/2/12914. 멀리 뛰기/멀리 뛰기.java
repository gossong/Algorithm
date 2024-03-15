class Solution {
    public long solution(int n) {
        long[] fibo = new long[n];
        fibo[0] = 1;
        if(n>1){
            fibo[1] = 2;
        }
        if(n>2){
            for(int i = 2; i < n; i++){
                fibo[i] = (fibo[i-1]+fibo[i-2]) % 1234567;
            }
        }
        long answer = fibo[n-1];
        return answer;
    }
}