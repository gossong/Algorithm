class Solution {
    public int solution(int n) {
        
        int answer = 1; // 본인 포함
        
        int check = 1; // 1부터 시작
        int sum = 0;
        
        // 끝까지 체크하기
        while(check!=n){
            for(int i = check; i <= n; i++){
                sum += i;
                // 합과 n이 같으면 answer++, sum 초기화, check++
                if(sum==n){
                    answer++;
                    sum = 0;
                    check++;
                    break;
                // 합과 n이 초과하면 sum 초기화, check++
                }else if(sum>n){
                    sum = 0;
                    check++;
                    break;
                }
            }
        }
        
        return answer;
    }
}