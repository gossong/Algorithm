class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] nums = (order+"").split("");
        for(String num : nums){
            if(Integer.parseInt(num)%3==0&&!num.equals("0")){
                answer++;
            }
        }
        return answer;
    }
}