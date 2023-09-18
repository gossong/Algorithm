class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
                
        for(int i = 0; i < babbling.length; i++){
            // 해당하는 단어를 "1"로 replace
            String str = babbling[i].replace("aya","1");
            str = str.replace("woo","1");
            str = str.replace("ye","1");
            str = str.replace("ma","1");
            
            System.out.println(str);
            int num;
            
            try {
                // string to int
                num = Integer.parseInt(str);
                // 전부 숫자일 경우, answer += 1
                if(num>0){
                    answer += 1;
                }
            } catch (NumberFormatException e){}
        }
        
        return answer;
    }
     
}