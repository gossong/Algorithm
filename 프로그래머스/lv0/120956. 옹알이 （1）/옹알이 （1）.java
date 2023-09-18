class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String [] word = {"aya", "woo", "ye", "ma"};
        
        for(int i = 0; i < babbling.length; i++){
            String str = babbling[i].replace("aya","1");
            str = str.replace("woo","1");
            str = str.replace("ye","1");
            str = str.replace("ma","1");
            
            int num;

            try {
                num = Integer.parseInt(str);
                if(num>0){
                    System.out.println(str);    
                    answer += 1;
                }
            } catch (NumberFormatException e){
                num = 0; // 숫자로 변환할수 없는 문자열 형태이면 0으로 초기화
            }
        }
        
        return answer;
    }
     
}