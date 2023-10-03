class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int[] check = new int[n];
        
        // section의 원소 check하여 +1
        for(int i = 0; i < section.length; i++){
            check[section[i]-1]++;
        }
        
        for(int i = 0; i < n; i++){
            // check 값이 1인 경우
            if(check[i]==1){
                // m만큼 값 추가
                for(int j = 0; j < m; j++){
                    if((i+j)<n)
                        check[i+j] = n;
                }
            answer++;
            }
        }
        return answer;
    }
}