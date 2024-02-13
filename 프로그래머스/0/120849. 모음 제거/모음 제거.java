class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] vowel = {"a","e","i","o","u"};
        for(int s = 0; s < my_string.length(); s++){
            boolean check = true;
            for(int i = 0; i < 5; i++){
                if(my_string.substring(s,s+1).equals(vowel[i])){
                    check = false;        
                }
            }
            if(check){
                answer += my_string.substring(s,s+1);
            }
        }
        return answer;
    }
}