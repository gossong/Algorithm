class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int z=0; z<10; z++){
            answer += z;
        }
        
        for(int i=0; i<numbers.length; i++){
            answer -= numbers[i];
        }
        
        return answer;
    }
}