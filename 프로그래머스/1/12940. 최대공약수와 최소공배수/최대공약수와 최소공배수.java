class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int tempMax = 1;
        int tempMin = n * m;
        for(int i = 2; i < Math.max(n,m); i++){
            if(n%i==0 && m%i==0){
                tempMax = Math.max(i,tempMax);
                tempMin = Math.min(n*m/i, tempMin);
            }
        }
        answer[0] = tempMax;
        answer[1] = tempMin;
        return answer;
    }
}