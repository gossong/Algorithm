class Solution {
    public int solution(int[] arr) {
        for(int i = 0; i < arr.length-1; i++){
            int a = gcd(arr[i+1], arr[i]);
            arr[i+1] = lcm(arr[i], arr[i+1], a);
        }
        int answer = arr[arr.length-1];
        return answer;
    }
    
    public int gcd(int x, int y){ // 최대공약수
        int r = x % y;
        if(r!=0){
            return gcd(y, r);
        }else{
            return y;
        }
    }
    
    public int lcm(int a, int b, int c){ // 최소공배수   
        return a * b / c;
    }
}