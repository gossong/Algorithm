class Solution {
    public static int solution(int number, int limit, int power) {
    	int answer = 0;
        
        int [] divNum = new int[number];
        
        for(int i=1; i<=number; i++){
           	int cnt = 0; // 약수 개수
           	// 1부터 n까지 모든 수로 나누어보기 - 시간 초과
//          for(int j=1; j<=i; j++){
//              if(i%j==0){
//                  cnt++;
//              }
//          }
            // 제곱근까지 확인
            for(int j=1; j*j<=i; j++){
                if(i%j==0){
                   divNum[i-1] += 2;
                   if(j*j==i){
                       divNum[i-1] -= 1;
                   }
               }
            }

               System.out.println(divNum[i-1]);
               
               if(divNum[i-1]<=limit){
                   answer += divNum[i-1];
               }else{
                   answer += power;
               }
           }
        
        return answer;
    }
}