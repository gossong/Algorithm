class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++){
            int sum = 0;
            String[] quizSplit = quiz[i].split(" ");
            if(quizSplit[1].equals("-")){
                sum = Integer.parseInt(quizSplit[0]) - Integer.parseInt(quizSplit[2]);
                if(sum == Integer.parseInt(quizSplit[4])){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }else{
                sum = Integer.parseInt(quizSplit[0]) + Integer.parseInt(quizSplit[2]);
                if(sum == Integer.parseInt(quizSplit[4])){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }
            
        }
        return answer;
    }
}