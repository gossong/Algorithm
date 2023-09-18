class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for(int i = 0; i < my_string.length(); i++){
            for(char letter = 'A'; a <= 'z'; a++){
                if(letter==my_string.charAt(i)){
                    // 아스키코드 사용
                    if(letter<='Z'){  // 대문자
                        answer[letter-65] += 1;  // answer[a-'A'] += 1;
                    }else{  // 소문자
                        answer[letter-97+26] += 1;  // answer[a-'a'+26] += 1;
                    }
                }
            }
        }
        
        return answer;
    }
}
