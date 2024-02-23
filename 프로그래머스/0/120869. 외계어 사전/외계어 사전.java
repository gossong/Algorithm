class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(String d : dic){
            boolean check = false;
            for(int i = 0; i < spell.length; i++){
                if(d.indexOf(spell[i])>-1){
                    check = true;
                }else{
                    check = false;
                    break;
                }
            }
            if(check){
                answer = 1;
            }
        }
        return answer;
    }
}