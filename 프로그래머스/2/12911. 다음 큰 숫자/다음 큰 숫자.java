class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toBinaryString(n); // 2진수로 변환
        int cnt = 0; // 1 갯수 세기
        for(int i = 0; i < str.length(); i++){
            if(str.substring(i,i+1).equals("1")){
                cnt++;
            }
        }
        
        while(n>0){
            String temp = Integer.toBinaryString(++n); // n +1하면서 확인
            int check = 0;
            for(int i = 0; i < temp.length(); i++){
                if(temp.substring(i,i+1).equals("1")){
                    check++;
                }
            }
            if(check==cnt){ // 갯수 같을 경우
                answer = Integer.parseInt(temp, 2); // 10진수로 변환
                break;
            }
        }
        
        return answer;
    }
}