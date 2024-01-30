class Solution {
    public String solution(String n_str) {
        String answer = n_str;
        if(n_str.startsWith("0")){
         for(int i = 0; i < n_str.length(); i++){
            if(!n_str.substring(i,i+1).equals("0")){
                answer = n_str.substring(i);
                break;
            }
        }   
        }
        return answer;
    }
}