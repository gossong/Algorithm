class Solution {
    public long solution(long n) {
        long answer = 0;
        if(n%Math.sqrt(n)==0){
            answer = (long)Math.pow((int)Math.sqrt(n)+1,2);
        }else{
            answer = -1;
        }
        return answer;
    }
}