class Solution {
    public static int solution(int number, int limit, int power) {
    	int answer = 0;

        int [] count = new int[number];  // 공격력 (약수의 개수)
        
        for(int i=1; i<=number; i++){
           	// 1부터 n까지 모든 수로 나누어보기 - 시간 초과
//          for(int j=1; j<=i; j++){
//              if(i%j==0){
//                  count[i-1]++;
//              }
//          }
            
            // 제곱근으로 확인 (sqrt로 확인 가능)
            for(int j=1; j*j<=i; j++){
                if(i%j==0){  // 약수 중 하나가 'j'일 경우, 나머지 하나는 'number/j'이므로 count +2
                   count[i-1] += 2;
                   if(j*j==i){  // 동일할 경우, count -1
                       count[i-1] -= 1;
                   }
               }
            }
               
               if(count[i-1]<=limit){  // count (약수의 개수) <= limit (공격력의 제한수치)
                   answer += count[i-1];
               }else{
                   answer += power;
               }
           }
        
        return answer;
    }
}
