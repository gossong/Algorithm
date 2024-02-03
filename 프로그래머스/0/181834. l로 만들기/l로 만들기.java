class Solution {
    public String solution(String myString) {
        String answer = "";
        String l = "l";
        for(int j = 0; j < myString.length(); j++){
            String check = myString.substring(j,j+1);
            if(l.compareTo(check)>-1){
                answer += "l";
            }else{
                answer += check;
            }
        }
        return answer;
    }
}