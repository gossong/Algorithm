class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        String reverse = "";
        for(int i = 0; i < queries.length; i++){
            reverse = answer.substring(queries[i][0],queries[i][1]+1);
            String reverseWord = "";
            for(int j = queries[i][0]; j < queries[i][1]+1; j++){
                reverseWord = answer.substring(j,j+1) + reverseWord;
            }
            answer = answer.substring(0,queries[i][0]) + reverseWord + answer.substring(queries[i][1]+1);
        }
        return answer;
    }
}