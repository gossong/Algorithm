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
            // 제곱근으로 확인 (sqrt로 확인 가능)
            for(int j=1; j*j<=i; j++){
                if(i%j==0){
                   cnt += 2;
                   if(j*j==i){
                       cnt -= 1;
                   }
               }
            }
               
               divNum[i-1] = cnt;
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
