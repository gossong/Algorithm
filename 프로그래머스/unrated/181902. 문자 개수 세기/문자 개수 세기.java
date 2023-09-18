class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for(int i = 0; i < my_string.length(); i++){
            for(char a = 'A'; a <= 'z'; a++){
                if(a==my_string.charAt(i)){
                    if(a<='Z'){
                        answer[a-65] += 1;
                    }else{
                        answer[a-71] += 1;
                    }
                }
            }
        }
        
        return answer;
    }
}