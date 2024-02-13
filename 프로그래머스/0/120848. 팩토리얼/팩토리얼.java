class Solution {
    public int solution(int n) {
        int answer = 1;
        int num = 1;
        while(num <= n){
            num *= ++answer;
        }
        return --answer;
    }
}