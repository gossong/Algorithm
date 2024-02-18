class Solution {
    public int solution(String my_string) {
        String[] my = my_string.split(" ");
        int answer = Integer.parseInt(my[0]);
        for(int i = 2; i < my.length; i+=2){
            if(my[i-1].equals("+")){
                answer += Integer.parseInt(my[i]);
            }else{
                answer -= Integer.parseInt(my[i]);
            }
        }
        return answer;
    }
}