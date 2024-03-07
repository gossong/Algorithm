class Solution {
    static int answer;
    static boolean[] visited;
    
    public int solution(int[] number) {
        answer = 0;
        // 3중 for문
        // for(int i = 0; i < number.length-2; i++){
        //     for(int j = i+1; j < number.length-1; j++){
        //         for(int k = j+1; k < number.length; k++){
        //             if((number[i]+number[j]+number[k])==0){
        //                 answer++;
        //             }
        //         }
        //     }
        // }
        
        // 재귀
        visited = new boolean[number.length];
        
        func(number, number.length, 0, 3); // 조합 nCr 3개 고르기
        
        return answer;
    }
    
    public static void func(int[] numbers, int n, int start, int r){
        if(r==0){
            int sum = 0;
            for(int i = 0; i < n; i++){
                if(visited[i]){
                    sum += numbers[i];
                }
            }
            if(sum == 0){
                answer++;
            }
            return;
        }
        
        for(int i = start; i < n; i++){
            if(!visited[i]){
                visited[i] = true;
                func(numbers, n, i, r-1);
                visited[i] = false;
            }
        }
    }
}