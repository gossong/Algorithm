class Solution {
    boolean solution(String s) {
        int cntP = 0;
        int cntY = 0;
        for(String letter : s.toLowerCase().split("")){
            if(letter.equals("p")){
                cntP++;
            } else if(letter.equals("y")){
                cntY++;
            }
        }
        boolean answer = cntP == cntY ? true : false;
        return answer;
    }
}