class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String change = "";
        for(int i = 0; i < myString.length(); i++){
            if(myString.substring(i, i+1).equals("A")){
                change += "B";
            }else{
                change += "A";
            }
        }
        if(change.indexOf(pat)>-1){
            answer = 1;
        }
        return answer;
    }
}