class Solution {
    public String solution(String s) {
        String[] num = s.split("\\s");
        int max = Integer.parseInt(num[0]);
        int min = Integer.parseInt(num[0]);
        for(int i = 1; i < num.length; i++){
            if(max < Integer.parseInt(num[i])){
                max = Integer.parseInt(num[i]);
            }
            if(min > Integer.parseInt(num[i])){
                min = Integer.parseInt(num[i]);
            }
        }
        
        return Integer.toString(min) + " "+ Integer.toString(max);
    }
}