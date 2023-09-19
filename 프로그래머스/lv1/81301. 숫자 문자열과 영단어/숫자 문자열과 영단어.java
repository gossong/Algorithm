class Solution {
    public int solution(String s) {
        int answer = 0;

        // 시간초과
        // s = s.replace("zero","0");
        // s = s.replace("one","1");
        // s = s.replace("two","2");
        // s = s.replace("three","3");
        // s = s.replace("four","4");
        // s = s.replace("five","5");
        // s = s.replace("six","6");
        // s = s.replace("seven","7");
        // s = s.replace("eight","8");
        // s = s.replace("night","9");
        
        String[] num = {"0", "1", "2", "3", "4", 
                        "5", "6", "7", "8", "9"};
        String[] word = {"zero", "one", "two", "three", "four", 
                         "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i<10; i++){
            s = s.replace(word[i], num[i]);
        }
        
        answer = Integer.parseInt(s);
        
        
        return answer;
    }
}
