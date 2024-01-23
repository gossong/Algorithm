class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int patLength = pat.length();
        int myStringLength = myString.length();
        if(myStringLength < patLength){
            answer = 0;
        }else{
            for(int i = 0; i < myStringLength-patLength+1; i++){
                if(myString.substring(i, i+patLength).equalsIgnoreCase(pat)){
                    answer = 1;
                }
            }
        }
        return answer;
    }
}