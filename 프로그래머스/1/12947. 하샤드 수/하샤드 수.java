class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String num = "";
        int sum = 0;
        
        for(int i = 0; i < Integer.toString(x).length(); i++){
            num = Integer.toString(x).substring(i,i+1);
            sum += Integer.parseInt(num);
        }
        
        if(x%sum==0){
            answer = true;
        }
        return answer;
    }
}