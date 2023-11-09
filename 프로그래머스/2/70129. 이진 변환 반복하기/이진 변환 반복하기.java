class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;  // 제거한 0의 개수
        int check = 0;  // 이진 변환 회차
        while(s.length()>1){
            int zero = 0;  // 0의 개수 초기화
            for(int i = 0; i < s.length(); i++){
                if(s.substring(i,i+1).equals("0")){
                    cnt++; zero++;
                }
            }
            s = Integer.toBinaryString(s.length()-zero);  // 이진 변환
            check++;
        }
        answer[0] = check;
        answer[1] = cnt;
        return answer;
    }
}