class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        for(int j = 0; j < picture.length * k; j++){
            answer[j] = "";
            for(int i = 0; i < picture[0].length(); i++){
                answer[j] += picture[j/k].substring(i,i+1).repeat(k);
            }
        }
        return answer;
    }
}