class Solution {
    public int solution(int a, int b) {
        for(int i = 2; i <= Math.min(a,b); i++){
            if(a%i==0 && b%i==0){
                a /= i;
                b /= i;
            }
        }
        if(b%5==0){
            while(b >= 5 && b%5==0){
                b /= 5;
            }
        }
        if(b%2==0){
            while(b >= 2 && b%2==0){
                b /= 2;
            }
        }
        int answer = b == 1 ? 1 : 2;
        return answer;
    }
}