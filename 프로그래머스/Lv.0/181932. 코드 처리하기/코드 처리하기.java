class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = true;
        for(int i = 0; i < code.length(); i++){
            String c = code.substring(i,i+1);
            if(mode){
                if(c.equals("1")){
                    mode = !mode;
                }else{
                    if(i%2==0){
                        answer += c;
                    }
                }
            }else{
                if(c.equals("1")){
                    mode = !mode;
                }else{
                    if(i%2!=0){
                        answer += c;
                    }
                }
            } 
        }
        if(answer.length()==0){
            return "EMPTY";
        }else{
            return answer;
        }
    }
}