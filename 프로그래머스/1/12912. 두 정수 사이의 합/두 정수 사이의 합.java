class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a==b){
            answer = a;
        }else if(a<b){
            answer = sum(a,b);
        }else{
            answer = sum(b,a);
        }
        return answer;
    }
    public long sum(int a, int b){
        long sum = 0;
        for(int i = a; i <= b; i++){
            sum += i;
        }
        return sum;
    }
}