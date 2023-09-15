class Solution {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        
        for(int i=0; i < sizes.length; i++){
            // 작은 수를 1열(w), 큰 수를 2열(h)에 저장
        	if(sizes[i][0]>sizes[i][1]) {
        		int c = sizes[i][0];
        		sizes[i][0] = sizes[i][1];
        		sizes[i][1] = c;
        	}
        	
        	if(w < sizes[i][0]){
                w = sizes[i][0];
            }
            if(h < sizes[i][1]){
            	h = sizes[i][1];
            }
        }
        
        return w * h;
    }

    // Math.max, Math.min을 사용
    public int solution(int[][] sizes) {
        int length = 0, height = 0;
        for (int[] card : sizes) {
            // 0행, 1행 중 - length : 큰 값 저장, height : 작은 값 저장
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        int answer = length * height;
        return answer;
    }
}
