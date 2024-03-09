class Solution {
    public int solution(int n) {
        String str = "";
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            str = n%3 + str;
            n /= 3;
        }
        sb.append(str);
        sb.reverse();
        int answer = Integer.parseInt(sb.toString(), 3);
        
        return answer;
    }
}