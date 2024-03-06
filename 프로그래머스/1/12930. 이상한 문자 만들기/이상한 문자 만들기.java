class Solution {
    public String solution(String s) {
        String answer = "";
        String[] word = s.split(" ",-1);
        for(int i = 0; i < word.length; i++){
            String[] letter = word[i].split("");
            for(int j = 0; j < letter.length; j++){
                if(j%2==0){
                    answer += letter[j].toUpperCase();
                }else{
                    answer += letter[j].toLowerCase();
                }
            }
            if(i < word.length-1){
                answer += " ";
            }
        }
        return answer;
    }
}