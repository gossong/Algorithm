class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] let = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for(int i = 0; i < let.length; i++){
            for(int j = 0; j < morse.length; j++){
                if(let[i].equals(morse[j])){
                    answer += (char)(j+97);
                    break;
                }
            }
        }
        return answer;
    }
}