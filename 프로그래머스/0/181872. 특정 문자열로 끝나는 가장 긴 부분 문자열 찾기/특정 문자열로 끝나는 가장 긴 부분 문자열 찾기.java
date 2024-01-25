class Solution {
    public String solution(String myString, String pat) {
        int num = 0;
        for(int i = 0; i < myString.length()-pat.length()+1; i++){
            if(myString.substring(i,i+pat.length()).equals(pat)){
                num = i;
            }
        }
        String answer = myString.substring(0,num+pat.length());        
        return answer;
    }
}