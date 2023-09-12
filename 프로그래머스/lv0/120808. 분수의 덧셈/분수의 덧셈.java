class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int a = 0;
        int b = 0;
        int max = 1;
        
        a = numer1*denom2 + numer2*denom1;
        b = denom1*denom2;
        
        for(int i=2; i<=b; i++){
            if((a%i==0)&&(b%i==0)){
                max = i;
            }
        
        }         
        a = a/max;
        b = b/max;
        
        int[] answer = {a,b};
        return answer;
    }
}