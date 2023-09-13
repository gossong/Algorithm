class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i=0; i<array.length; i++){
            String str = Integer.toString(array[i]);
            for(int j=0; j<str.length(); j++){
                if(str.substring(j,j+1).equals("7")){
                    answer++;
                }
            }  
        }
        
        return answer;
    }
}