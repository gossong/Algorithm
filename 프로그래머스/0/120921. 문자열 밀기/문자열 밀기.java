class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        int count = A.length();
        if(A.equals(B)){
            answer = 0;    
        }else{
            while(count > 0){
                String str = A;
                str = str.substring(count, A.length()) + str.substring(0, count);
                if(str.equals(B)){
                    answer = A.length() - count;
                    break;
                }
                count--;
            }
        }
        return answer;
    }
}