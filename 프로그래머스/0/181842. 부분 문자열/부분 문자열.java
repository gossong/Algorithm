class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        for(int i = 0; i < str2.length() - str1.length() + 1; i++){
            if(str2.substring(i,i+str1.length()).equals(str1)){
                answer = 1;
            }
        }
        return answer;
    }
}