class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] put = rsp.split("");
        for(String p : put){
            if(p.equals("2")){
                answer += "0";
            }else if(p.equals("0")){
                answer += "5";
            }else{
                answer += "2";
            }
        }
        return answer;
    }
}