class Solution {
    public String solution(String s) {
        String answer = "";
        int[] alphabet = new int[26];
        for(char c : s.toCharArray()){
            alphabet[c - '0' - 49]++;
        }
        for(int i = 0; i < alphabet.length; i++){
            if(alphabet[i]==1){
                answer += String.valueOf((char)(i + 97));
            }
        }
        return answer;
    }
}