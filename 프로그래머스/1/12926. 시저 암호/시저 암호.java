class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(char letter : s.toCharArray()){
            if(letter == ' '){
                answer += letter;
            }else if(letter+n > 'z'){
                answer += (char) (letter-26+n);
            }else if(letter+n >'Z' && letter < 'a'){
                answer += (char) (letter-26+n);
            }else{
                answer += (char) (letter+n);
            }
            
        }
        return answer;
    }
}