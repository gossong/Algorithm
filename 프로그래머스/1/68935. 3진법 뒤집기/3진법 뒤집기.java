class Solution {
    public int solution(int n) {
        String str = "";
        while(n!=0){
            str = str + n%3;
            n /= 3;
        }
        int answer = Integer.parseInt(str, 3);
        
        return answer;
    }
}